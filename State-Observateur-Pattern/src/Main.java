package src;

import src.controleur.ControleurMontre;
import src.observateur.FenetreAffichageEtat;
import src.observateur.FenetreAffichageHeure;
import src.observateur.FenetreBoutons;

public class Main {

    public static void main(String[] args) {
        Montre m = new Montre();
        FenetreAffichageHeure fah = new FenetreAffichageHeure();
        FenetreAffichageEtat fae = new FenetreAffichageEtat();
        m.attacher(fae);
        m.attacher(fah);
        ControleurMontre c = new ControleurMontre(m);

        FenetreBoutons fb = new FenetreBoutons();
        fb.setControleur(c);
    }
}
