package Vues;

import Controleur.Controleur;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FenetreActions extends JFrame implements ActionListener,
        WindowListener {

    private JButton boutonAttaquer;
    private JButton boutonSoigner;
    private JButton boutonFuir;
    private JButton boutonPokemons;

    private Controleur controleur;

    public FenetreActions() {
        setTitle("Actions");
        setBounds(500, 100, 400, 150);

        JPanel panActions = new JPanel();
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        boutonAttaquer = new JButton("Attaquer");
        boutonSoigner = new JButton("Soigner");
        boutonPokemons = new JButton("Pokemons");
        boutonFuir = new JButton("Fuir");
        panActions.add(boutonAttaquer);
        panActions.add(boutonSoigner);
        panActions.add(boutonPokemons);
        panActions.add(boutonFuir);

        contentPane.add(panActions, "North");

        boutonAttaquer.addActionListener(this);
        boutonSoigner.addActionListener(this);
        boutonPokemons.addActionListener(this);
        boutonFuir.addActionListener(this);

        addWindowListener(this);
        setVisible(true);
    }

    public void setControleur(Controleur c) {
        this.controleur = c;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boutonAttaquer) {
            System.out.println("Vous venez d'appuyer sur le bouton Attaquer");
            controleur.attaquer();
        }
        if (e.getSource() == boutonSoigner) {
            System.out.println("Vous venez d'appuyer sur le bouton Soigner");
            controleur.soigner();
        }
        if (e.getSource() == boutonPokemons) {
            System.out.println("Vous venez d'appuyer sur le bouton Pokemons");
            controleur.pokemons();
        }
        if (e.getSource() == boutonFuir) {
            System.out.println("Vous venez d'appuyer sur le bouton Fuir");
            System.exit(0);
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("terminer");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
