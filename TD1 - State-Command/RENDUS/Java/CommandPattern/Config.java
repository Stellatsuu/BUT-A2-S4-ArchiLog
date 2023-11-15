package CommandPattern;

import Socket.Socket;

public class Config implements Commande {

    private Socket socket;

    public Config(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void executer() {
        socket.getEtat().config();
    }
}
