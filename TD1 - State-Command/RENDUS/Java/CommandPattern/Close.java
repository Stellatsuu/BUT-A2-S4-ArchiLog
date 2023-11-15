package CommandPattern;

import Socket.Socket;
import StatePattern.Initial;

public class Close implements Annulable {

    private Socket socket;

    public Close(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void executer() {
        socket.getEtat().close();
    }

    @Override
    public void annuler() {
        socket.setEtat(new Initial(socket));
    }
}
