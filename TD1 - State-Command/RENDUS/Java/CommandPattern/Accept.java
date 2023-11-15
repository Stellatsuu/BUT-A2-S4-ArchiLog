package CommandPattern;

import Socket.Socket;

public class Accept implements Commande {

    private Socket socket;

    public Accept(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void executer() {
        socket.getEtat().accept();
    }
}
