package Client;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.rmi.RemoteException;
import java.util.List;
import Annuaire.Annuaire;
import Compression.CompressionUtils;


public class Downloader {

    private static final String TmpFiles_DIR = "TmpFiles/";
    

    public Downloader() {
        new File(TmpFiles_DIR).mkdirs();
    }

    public void demarrerTelechargement(String clientId, String fichier, List<String> sources , int totalFragments, Annuaire annuaire, boolean compresser) {
       // Chemin personnel du client
       File clientDir = new File("./MesFilms/" + clientId);

       // Créer le répertoire personnel du client s'il n'existe pas
       if (!clientDir.exists()) {
           clientDir.mkdirs();
       }
        System.out.println("Telechargement du fichier : " + fichier);

        // Démarrer le timer
        long startTime = System.nanoTime();

        byte[][] fragments = new byte[totalFragments][]; // stockage des fragments recus
        Thread[] threadsFragments = new Thread[totalFragments];

        // Telecharger chaque fragment depuis les sources
        for (int i = 0; i < totalFragments; i++) {
            int fragmentId = i; 
            String source = sources.get(i % sources.size()); // Choisir une source pour ce fragment
            threadsFragments[i] = new Thread(() -> telechargerFragment(source, fichier, fragmentId, fragments, totalFragments, annuaire, compresser));
            threadsFragments[i].start();
        }

        for (int i =0; i<totalFragments;i++){
            try {
                threadsFragments[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        assemblerFichier(clientId, fichier, totalFragments);

        // Arrêter le timer
        long endTime = System.nanoTime();

        // Calculer la durée totale
        long durationInMillis = (endTime - startTime) / 1_000_000;
        System.out.println("Temps total d'execution : " + durationInMillis + " ms");

    }

    private void telechargerFragment(String source, String filmName, int fragmentId, byte[][] fragments, int totalFragments, Annuaire annuaire, boolean compresser) {
        try {

            String[] parts = source.split(":");  // client:port
            // String host = parts[0];
            String host = "localhost"; 
            int port = Integer.parseInt(parts[1]);

            try (Socket socket = new Socket(host, port);
                 DataInputStream input = new DataInputStream(socket.getInputStream());
                 PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                 FileOutputStream fos = new FileOutputStream(TmpFiles_DIR +"Tmp_" + fragmentId + "_" + filmName)) {
                
                // Envoyer l'identifiant du fragment au Daemon

                
                
                socket.setSoTimeout(0); // Désactiver le timeout
                out.println(filmName +":"+ fragmentId+ ":"+ totalFragments + ":" + String.valueOf(compresser));
                int bufferSize = 4096;
                byte[] buffer = new byte[bufferSize];
                
                long fragmentSize = input.readLong(); // Read file size
                System.out.println("fragment size :" + fragmentSize);
                int bytesRead; 
                long totalBytesRead = 0;

                if (compresser) {
                    int compressedSize = input.readInt();

                    // Lire les données compressées
                    byte[] compressedData = new byte[compressedSize];
                    input.readFully(compressedData);

                    // Décompresser tout le fragment
                    byte[] decompressedFragment = CompressionUtils.decompress(compressedData);

                    // Écrire les données décompressées dans le fichier temporaire
                    fos.write(decompressedFragment);

                } else {
                    while (totalBytesRead < fragmentSize    && (bytesRead = input.read(buffer)) != -1 ) {
                        fos.write(buffer, 0, (fragmentSize - totalBytesRead>bufferSize)?bytesRead:(int)(fragmentSize-totalBytesRead));
                        totalBytesRead += bytesRead;
                    }
                }

            }
        } catch (Exception e) {
            System.err.println("Erreur lors du telechargement du fragment " + fragmentId +" depuis " + source + " : " + e.getMessage());

            try {
                List<String> nouvellesSources = annuaire.rechercherSources(filmName);
                if (!nouvellesSources.isEmpty()) {
                    String nouvellesource = nouvellesSources.get(0); // Choisir la première source disponible
                    System.out.println("Relancement du telechargement du fragment " + fragmentId +" depuis " + nouvellesource + " : " + e.getMessage());
                    telechargerFragment(nouvellesource, filmName, fragmentId, fragments, totalFragments, annuaire, compresser);
                } else {
                    System.err.println("Aucune autre source disponible pour le fragment " + fragmentId);
                }
            } catch (RemoteException re) {
                System.err.println("Erreur lors du relencement du fragment " + fragmentId + e.getMessage());
            }
        }
    }

    private void assemblerFichier(String clientId, String fichier, int totalFragments) {
        FileInputStream fis = null ;

        try (FileOutputStream fos = new FileOutputStream("./MesFilms/" + clientId + "/" + fichier)) {
            File file = new File("./MesFilms/" + clientId + "/" + fichier);           
            int bytesRead;
            int bufferMax = 4096; 
            byte[] buffer = new byte[bufferMax];
            for (int fragmentId = 0; fragmentId < totalFragments; fragmentId++){
                fis = new FileInputStream(TmpFiles_DIR +"Tmp_" + fragmentId + "_" + fichier);
                while (((bytesRead = fis.read(buffer)) != -1 ) ) {
                    fos.write(buffer, 0, bytesRead);
                }
        }

            long fileSize = file.length();
            System.out.println("Total file size telecharge: "+ fileSize);
            
        } catch (Exception e) {
            System.err.println("Erreur lors de l'assemblage du fichier : " + e.getMessage());
        } finally{
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    // Handle any exceptions that occur during closing
                }
            }
        }
    }
}
