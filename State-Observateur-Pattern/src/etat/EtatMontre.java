package src.etat;

import src.Montre;

public abstract class EtatMontre {
    Montre montre;
    public EtatMontre(Montre m){
        montre = m;
    }
    public void boutonMode() { System.out.println("Erreur, le mode actuel ne peut pas être changé."); }

    public void boutonAvancer() {
        System.out.println("Erreur, le mode actuel ne permet pas d'avancer le temps.");
    }
}
