import Controleur.ControleurJeu;
import Objets.Pokemon;
import Strategies.StrategiePotionMax;
import Vues.FenetreActions;
import Vues.FenetreEtat;
import Vues.FenetreVie;

public class Main {

    public static void main(String[] args) {
        Pokemon p = new Pokemon("Dracaufeu", 500, new StrategiePotionMax());
        FenetreEtat etat = new FenetreEtat(p);
        FenetreVie vie = new FenetreVie(p);
        p.bind(etat);
        p.bind(vie);
        ControleurJeu c = new ControleurJeu(p);

        FenetreActions actions = new FenetreActions();
        actions.setControleur(c);
    }
}