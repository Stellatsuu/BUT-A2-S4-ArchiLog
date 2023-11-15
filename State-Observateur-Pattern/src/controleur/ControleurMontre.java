package src.controleur;

import src.Montre;

public class ControleurMontre implements Controleur {

    private Montre montre;

    public ControleurMontre(Montre m) {
        this.montre = m;
    }

    @Override
    public void boutonMode() {
        montre.boutonMode();
    }

    @Override
    public void boutonAvancer() {
        montre.boutonAvancer();
    }
}
