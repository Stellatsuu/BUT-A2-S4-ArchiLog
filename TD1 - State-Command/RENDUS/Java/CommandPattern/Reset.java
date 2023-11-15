package CommandPattern;

import Socket.Socket;
import StatePattern.Initial;

public class Reset implements Annulable {

    private Socket socket;

    public Reset(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void executer() {
        socket.getEtat().reset();
    }


    @Override
    public void annuler() {
        socket.setEtat(new Initial(socket));
    }
}
