package CommandPattern;

import Socket.Socket;

public class Read implements Commande {

    private Socket socket;

    public Read(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void executer() {
        socket.getEtat().read();
    }
}
