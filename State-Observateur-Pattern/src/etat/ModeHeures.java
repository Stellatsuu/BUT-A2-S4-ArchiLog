package src.etat;

import src.Montre;

public class ModeHeures extends EtatMontre{
    public ModeHeures(Montre m) {
        super(m);
    }
    @Override
    public void boutonMode(){
        montre.setEtat(new ModeMinutes(montre));
    }
    @Override
    public void boutonAvancer(){
        montre.incrHeures();
    }
}
