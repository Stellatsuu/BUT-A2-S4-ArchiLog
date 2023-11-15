package Vues;

import Objets.Pokemon;

import javax.swing.*;
import java.awt.*;

public class FenetreVie extends JFrame implements Observateur {

    private JTextField txtVie;

    public FenetreVie(Pokemon pokemon) {
        setTitle("Vie du pokemon");
        setBounds(500, 500, 190, 130);
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        JLabel labVie = new JLabel("VIE");
        contentPane.add(labVie);
        txtVie = new JTextField(15);
        contentPane.add(txtVie);
        setVisible(true);
        afficherVie(String.valueOf(pokemon.getPv()));
    }

    public void afficherVie(String vie) {
        txtVie.setText(vie);
    }

    @Override
    public void update(Pokemon pokemon) {
        afficherVie(String.valueOf(pokemon.getPv()));
    }
}
