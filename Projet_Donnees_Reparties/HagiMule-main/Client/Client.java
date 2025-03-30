package Client;

import java.io.File;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import Annuaire.Annuaire;

public class Client {
    private String id;
    private List<String> fichiersPossedes;
    private Daemon daemon;
    private Downloader downloader;

    public Client(String nom, int portDaemon) {
        this.id = nom +":"+ portDaemon;
        this.fichiersPossedes = new ArrayList<>();
        this.daemon = new Daemon(portDaemon);
        this.downloader = new Downloader();
        // Créer un dossier unique pour le client
        File clientDir = new File("./MesFilms/" + nom);
        if (!clientDir.exists()) {                        
            clientDir.mkdirs();
        }

        // Scanner les fichiers du client
        File[] files = clientDir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    fichiersPossedes.add(file.getName());
                }
            }
        }
        
        
    }




    public void lancerDaemon() {
        String nom = this.id.split(":")[0];
        daemon.ouvrirConnexion(nom);
    }

    public void mettreAJourFichiers(Annuaire annuaire) {
        for (String fichier : fichiersPossedes) {
            try {
                annuaire.enregistrerFichier(id, fichier);
            } catch (RemoteException e) {
                System.err.println("Erreur lors de l'enregistrement du fichier : " + fichier);
            }
        }
    }

    public void ajouterFichier(String fichier) {
        fichiersPossedes.add(fichier);
    }

    public void telechargerFichier(String fichier, Annuaire annuaire, boolean compresser) {
        try {
            List<String> sources = annuaire.rechercherSources(fichier);
            System.out.println("les sources disponible : "+ sources);
            if (sources.isEmpty()) {
                System.out.println("Aucune source disponible pour le fichier : " + fichier);
                return;
            }

            // on peut implemanter un code qui optimise ce nombre de fragments 
            // proposition simple : nbr fragment == nbr sources disponibles 
            int totalFragments = sources.size();
            String nom = this.id.split(":")[0];
            downloader.demarrerTelechargement(nom, fichier, sources, totalFragments, annuaire, compresser);
            ajouterFichier(fichier);
        } catch (RemoteException e) {
            System.err.println("Erreur lors de la recherche ou du telechargement : " + e.getMessage());
        }
    }



    // Main
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage : java client.Client <clientId> <daemonPort> <mode = 0 or 1>");
            return;
        }

        String clientId = args[0];
        int daemonPort = Integer.parseInt(args[1]);
        String choix = args[2]; // deamon == 0 & downloader == 1
    
        try {
            Annuaire annuaire = (Annuaire) Naming.lookup("//localhost:9008/Annuaire");
            Client client = new Client(clientId, daemonPort);

            if (choix.equals("0")) {
                Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                    try {
                        annuaire.retirerClient(client.id);
                        System.out.println("Client " + client.id.split(":")[0] + " retire de l'annuaire.");
                    } catch (Exception e) {
                        System.err.println("Erreur lors du retrait du client : " + e.getMessage());
                    }
                }));

                client.mettreAJourFichiers(annuaire);
                new Thread(client::lancerDaemon).start();
            } else {

                boolean compresser;            //mode compression/decompresssion
                if (args.length == 5) {
                    compresser = args[4].equals("c");
                } else {
                    compresser = false;
                }

                String film = args[3];               
                client.telechargerFichier(film, annuaire, compresser);                
                if (annuaire.estClientPresent(client.id)) {                    
                    client.mettreAJourFichiers(annuaire);
                }
            }
            
            

        } catch (Exception e) {
            System.err.println("Erreur lors du démarrage du client : " + e.getMessage());
        }
    }

 
}
