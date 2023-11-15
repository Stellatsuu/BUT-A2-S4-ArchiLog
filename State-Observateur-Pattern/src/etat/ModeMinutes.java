package src.etat;

import src.Montre;

public class ModeMinutes extends EtatMontre{
    public ModeMinutes(Montre m) {
        super(m);
    }

    @Override
    public void boutonMode(){
        montre.setEtat(new ModeAffichage(montre));
    }
    @Override
    public void boutonAvancer(){
        montre.incrMinutes();
    }
}
