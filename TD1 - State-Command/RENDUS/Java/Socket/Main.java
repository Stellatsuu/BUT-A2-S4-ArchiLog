package Socket;

import CommandPattern.*;

public class Main {

    public static void main(String[] args) {
        Socket socket = new Socket();
        Simulator simulator = new Simulator();

        simulator.setCommande("accept", new Accept(socket));
        simulator.setCommande("close", new Close(socket));
        simulator.setCommande("config", new Config(socket));
        simulator.setCommande("connect", new Connect(socket));
        simulator.setCommande("listen", new Listen(socket));
        simulator.setCommande("read", new Read(socket));
        simulator.setCommande("reset", new Reset(socket));

        System.out.println(socket.getEtat()); //Etat Initial
        simulator.executerCommande("listen");
        System.out.println(socket.getEtat()); //Etat Ecoute
        simulator.executerCommande("close");
        System.out.println(socket.getEtat()); //Etat Fermee
        simulator.annulerCommande(); //Annulation de la fermeture, retour à l'état Initial
        System.out.println(socket.getEtat()); //Etat Initial

        /*for (int i = 0; i < 10; i++) {
            socket.circuitEcouteNormal();
        }*/


    }
}
