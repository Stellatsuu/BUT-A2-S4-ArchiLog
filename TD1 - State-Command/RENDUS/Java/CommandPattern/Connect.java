package CommandPattern;

import Socket.Socket;
import StatePattern.Initial;

public class Connect implements Annulable {

    private Socket socket;

    public Connect(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void executer() {
        socket.getEtat().connect();
    }

    @Override
    public void annuler() {
        socket.setEtat(new Initial(socket));
    }
}
