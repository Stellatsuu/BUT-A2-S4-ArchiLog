package StatePattern;

import Socket.Socket;

public class Initial extends EtatSocket {
    public Initial(Socket s) {
        super(s);
    }

    @Override
    public void listen() {
        System.out.println("Ecoute.");
        socket.setEtat(new Ecoute(socket));
    }

    @Override
    public void connect() {
        System.out.println("Connexion.");
        socket.setEtat(new Connectee(socket));
    }
}
