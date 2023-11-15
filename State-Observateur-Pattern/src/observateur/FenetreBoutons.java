package src.observateur;

import src.controleur.Controleur;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FenetreBoutons extends JFrame implements ActionListener,
        WindowListener {

    private JButton btMode;
    private JButton btAvance;
    private JButton btQuitter;
    private Controleur controleur;

    public FenetreBoutons() {
        setTitle("Exercice de la montre");
        setBounds(500, 100, 400, 150);
        JPanel panMontre = new JPanel();
        JPanel panQuitter = new JPanel();
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        btMode = new JButton("Mode");
        btAvance = new JButton("Avance");
        btQuitter = new JButton("Quitter");
        panMontre.add(btMode);
        panMontre.add(btAvance);
        panQuitter.add(btQuitter);

        contentPane.add(panMontre, "North");
        contentPane.add(panQuitter, "South");

        btMode.addActionListener(this);
        btAvance.addActionListener(this);
        btQuitter.addActionListener(this);

        addWindowListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btMode) {
            System.out.println("Vous venez d'appuyer sur le bouton Mode");
            controleur.boutonMode();
        }
        if (e.getSource() == btAvance) {
            System.out.println("Vous venez d'appuyer sur le bouton Avance");
            controleur.boutonAvancer();
        }
        if (e.getSource() == btQuitter) {
            System.out.println("Vous venez d'appuyer sur le bouton Quitter");
            System.exit(0);
        }
    }

    public void setControleur(Controleur c) {
        this.controleur = c;
    }

    public void windowClosing(WindowEvent arg0) {
        System.out.println("terminer");
        System.exit(0);
    }

    public void windowActivated(WindowEvent arg0) {
    }

    public void windowClosed(WindowEvent arg0) {
    }

    public void windowDeactivated(WindowEvent arg0) {
    }

    public void windowDeiconified(WindowEvent arg0) {
    }

    public void windowIconified(WindowEvent arg0) {
    }

    public void windowOpened(WindowEvent arg0) {
    }
}