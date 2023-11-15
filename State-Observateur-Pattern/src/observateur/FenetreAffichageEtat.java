package src.observateur;

import src.Montre;

import javax.swing.*;
import java.awt.*;

public class FenetreAffichageEtat extends JFrame implements Observateur {

    private JTextField txtEtat;

    public FenetreAffichageEtat() {
        setTitle("Etat de la montre");
        setBounds(500, 500, 190, 130);
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        JLabel labEtat = new JLabel("ETAT");
        contentPane.add(labEtat);
        txtEtat = new JTextField(15);
        contentPane.add(txtEtat);
        setVisible(true);
        afficherEtat("pas d'état");
    }

    public void afficherEtat(String etat) {
        txtEtat.setText(etat);
    }

    @Override
    public void update(Montre m) {
        afficherEtat(String.valueOf(m.getEtat().getClass()));
    }
}
