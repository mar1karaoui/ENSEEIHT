package Annuaire;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnnuaireImpl extends UnicastRemoteObject implements Annuaire {

    private Map<String, List<String>> fichiers; // { nameSource:port , listes des films}

    public AnnuaireImpl() throws RemoteException {
        super();
        this.fichiers = new HashMap<>();
    }

    @Override
    public synchronized void enregistrerFichier(String clientId, String fichier) throws RemoteException {
        fichiers.putIfAbsent(fichier, new ArrayList<>());
        if (!fichiers.get(fichier).contains(clientId)) {
            fichiers.get(fichier).add(clientId);
            System.out.println("Fichier enregistre : " + fichier + " par le client : " + clientId);
        }
    }

    @Override
    public synchronized void retirerClient(String clientId) throws RemoteException {
        fichiers.values().forEach(clients -> clients.remove(clientId));
        fichiers.entrySet().removeIf(entry -> entry.getValue().isEmpty());
        System.out.println("Client retiré : " + clientId);
    }

    @Override
    public List<String> rechercherSources(String fichier) throws RemoteException {
        return fichiers.getOrDefault(fichier, Collections.emptyList());
    }

    @Override
    public synchronized boolean estClientPresent(String clientId) throws RemoteException {
        // Vérifie si le client est associé à au moins un fichier dans l'annuaire
        return fichiers.values().stream().anyMatch(clients -> clients.contains(clientId));
    }
    
    public static void main(String[] args) throws RemoteException, MalformedURLException, java.rmi.AlreadyBoundException {
        LocateRegistry.createRegistry(9008);
        Naming.bind("//localhost:9008/Annuaire", new AnnuaireImpl());
        System.out.println("RMI server is running");

    }
}
