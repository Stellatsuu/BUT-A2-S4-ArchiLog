package CommandPattern;

import java.util.ArrayList;
import java.util.HashMap;

public class Simulator {

    private HashMap<String, Commande> listeCommandes;
    private Commande dernierCommande;

    public Simulator() {
        listeCommandes = new HashMap<>();
    }

    public Simulator(HashMap<String, Commande> listeCommandes) {
        this.listeCommandes = listeCommandes;
    }

    public void executerCommande(String instructionCommande) {
        try {
            dernierCommande = listeCommandes.get(instructionCommande);
            dernierCommande.executer();
        } catch (Exception e) {
            System.out.println("La commande n'existe pas");
        }
    }

    public void setCommande(String instructionCommande, Commande nomCommande) {
        listeCommandes.put(instructionCommande, nomCommande);
    }

    public void annulerCommande() {
        try {
            ((Annulable) dernierCommande).annuler();
        } catch (Exception e) {
            System.out.println("La commande n'est pas annulable");
        }
    }

}
