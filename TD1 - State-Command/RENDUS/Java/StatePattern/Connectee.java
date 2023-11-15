package StatePattern;

import Socket.Socket;

public class Connectee extends EtatSocket {
    public Connectee(Socket s) {
        super(s);
    }

    @Override
    public void read() {
        System.out.println("Message console");
    }

    @Override
    public void close() {
        System.out.println("Fermeture.");
        socket.setEtat(new Fermee(socket));
    }
}
