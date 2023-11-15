package Vues;

import Objets.Pokemon;

import javax.swing.*;
import java.awt.*;

public class FenetreEtat extends JFrame implements Observateur {

    private JTextField txtEtat;

    public FenetreEtat(Pokemon p) {
        setTitle("Etat du pokemon");
        setBounds(500, 500, 190, 130);
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        JLabel labEtat = new JLabel("ETAT");
        contentPane.add(labEtat);
        txtEtat = new JTextField(15);
        contentPane.add(txtEtat);
        setVisible(true);
        afficherEtat(String.valueOf(p.getEtat().getClass()));
    }

    public void afficherEtat(String etat) {
        txtEtat.setText(etat);
    }

    @Override
    public void update(Pokemon p) {
        afficherEtat(String.valueOf(p.getEtat().getClass()));
    }
}
