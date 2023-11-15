package StatePattern;

import Socket.Socket;

public abstract class EtatSocket {

    Socket socket;

    public EtatSocket(Socket s) {
        socket = s;
    }

    public void listen() {
        System.out.println("Erreur, l'état actuel ne permet pas l'écoute.");
    }

    public void read() {
        System.out.println("Erreur, l'état actuel ne permet pas la lecture.");
    }

    public void close() {
        System.out.println("Erreur, l'état actuel ne permet pas la fermeture.");
    }

    public void connect() {
        System.out.println("Erreur, l'état actuel ne permet pas la connexion.");
    }

    public void accept() {
        System.out.println("Erreur, l'état actuel ne permet pas la connexion.");
    }

    public void config() {
        System.out.println("Erreur, l'état actuel ne permet pas la configuration.");
    }

    public void reset() {
        System.out.println("Erreur, l'état actuel ne permet pas être réinitialisé.");
    }


}
