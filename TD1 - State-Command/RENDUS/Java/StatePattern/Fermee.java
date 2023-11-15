package StatePattern;

import Socket.Socket;

public class Fermee extends EtatSocket {
    public Fermee(Socket s) {
        super(s);
    }

    @Override
    public void reset() {
        System.out.println("Réinitialisation.");
        socket.setEtat(new Initial(socket));
    }
}
