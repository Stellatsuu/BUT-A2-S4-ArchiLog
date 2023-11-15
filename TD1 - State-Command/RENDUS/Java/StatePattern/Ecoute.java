package StatePattern;

import Socket.Socket;

public class Ecoute extends EtatSocket {
    public Ecoute(Socket s) {
        super(s);
    }

    @Override
    public void accept() {
        System.out.println("Accepté.");
        socket.setEtat(new Configuration(socket));
    }

    @Override
    public void close() {
        System.out.println("Fermeture.");
        socket.setEtat(new Fermee(socket));
    }
}
