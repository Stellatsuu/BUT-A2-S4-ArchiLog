package Socket;

import StatePattern.EtatSocket;
import StatePattern.Initial;

public class Socket {

    EtatSocket etat = new Initial(this);

    public void setEtat(EtatSocket e) {
        etat = e;
    }

    public EtatSocket getEtat() {
        return etat;
    }


    public void circuitEcouteNormal() {
        etat.listen();
        System.out.println(etat.getClass().getName());
        etat.accept();
        System.out.println(etat.getClass().getName());
        etat.config();
        System.out.println(etat.getClass().getName());
        etat.read();
        System.out.println(etat.getClass().getName());
        etat.close();
        System.out.println(etat.getClass().getName());
        etat.reset();
        System.out.println(etat.getClass().getName());
    }
}
