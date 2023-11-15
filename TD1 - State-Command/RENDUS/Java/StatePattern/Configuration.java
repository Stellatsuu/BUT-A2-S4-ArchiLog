package StatePattern;

import Socket.Socket;

public class Configuration extends EtatSocket {
    public Configuration(Socket s) {
        super(s);
    }

    @Override
    public void config() {
        System.out.println("Configuration.");
        socket.setEtat(new Connectee(socket));
    }
}
