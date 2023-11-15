package src.etat;

import src.Montre;

public class ModeAffichage extends EtatMontre{
    public ModeAffichage(Montre m) {
        super(m);
    }
    @Override
    public void boutonMode(){
        montre.setEtat(new ModeHeures(montre));
    }
}
