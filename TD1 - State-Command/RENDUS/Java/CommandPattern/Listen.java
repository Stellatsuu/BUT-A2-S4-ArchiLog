package CommandPattern;

import Socket.Socket;

public class Listen implements Commande {

    private Socket socket;

    public Listen(Socket socket) {
        this.socket = socket;
    }
    
    @Override
    public void executer() {
        socket.getEtat().listen();
    }
}
