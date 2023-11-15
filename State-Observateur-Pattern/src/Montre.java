package src;

import src.etat.EtatMontre;
import src.etat.ModeAffichage;
import src.observateur.Observateur;

import java.util.ArrayList;

public class Montre {

    private int heures = 0;
    private int minutes = 0;
    private EtatMontre etat = new ModeAffichage(this);

    private ArrayList<Observateur> ecouteurs = new ArrayList<>();

    public void boutonMode() {
        etat.boutonMode();
    }

    public void boutonAvancer() {
        etat.boutonAvancer();
    }

    public void incrHeures() {
        heures += 1;
        if (heures == 24) {
            heures = 0;
        }
        notifier();
    }

    public void incrMinutes() {
        minutes += 1;
        if (minutes == 60) {
            minutes = 0;
        }
        notifier();
    }

    public void setEtat(EtatMontre e) {
        etat = e;
        notifier();
    }

    public EtatMontre getEtat() {
        return etat;
    }

    public int getHeures() {
        return heures;
    }

    public int getMinutes() {
        return minutes;
    }

    public void attacher(Observateur ecouteur) {
        ecouteurs.add(ecouteur);
    }

    public void notifier() {
        for (Observateur o : ecouteurs) {
            o.update(this);
        }
    }


    public String toString() {
        if (heures < 10 && minutes < 10) {
            return "0" + heures + ":0" + minutes;
        } else if (heures < 10) {
            return "0" + heures + ":" + minutes;
        } else if (minutes < 10) {
            return heures + ":0" + minutes;
        }
        return heures + ":" + minutes;
    }
}
