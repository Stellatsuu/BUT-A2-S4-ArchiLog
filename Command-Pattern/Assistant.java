import java.util.HashMap;
import java.util.concurrent.ExecutionException;

public class Assistant {
    private HashMap<String, Commande> listeCommandes;
    private Commande derniereCommande;

    public Assistant(){
        listeCommandes = new HashMap<>();
    }
    public Assistant(HashMap<String, Commande> listeCommandes){
        this.listeCommandes = listeCommandes;
    }

    public void executerCommande(String instructionCommande){
        try {
            derniereCommande = listeCommandes.get(instructionCommande);
            derniereCommande.executer();
        }
        catch (Exception e){
            System.out.println("La commande n'existe pas");
        }
    }

    public void setCommande(String instructionCommande, Commande nomCommande){
        listeCommandes.put(instructionCommande, nomCommande);
    }

    public void annulerCommande(){
        derniereCommande.annuler();
    }
}
