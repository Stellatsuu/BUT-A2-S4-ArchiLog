package src.observateur;

import src.Montre;

import javax.swing.*;
import java.awt.*;

public class FenetreAffichageHeure extends JFrame implements Observateur {

    private JTextField txtHeure;

    public FenetreAffichageHeure() {
        setTitle("Affichage Heure");
        setBounds(300, 500, 190, 130);
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        JLabel labHeure = new JLabel("HEURE");
        contentPane.add(labHeure);
        txtHeure = new JTextField(15);
        contentPane.add(txtHeure);
        setVisible(true);
        afficherHeure("pas d'heure");
    }

    public void afficherHeure(String heure) {
        txtHeure.setText(heure);
    }

    @Override
    public void update(Montre m) {
        afficherHeure(m.getHeures() + ":" + m.getMinutes());
    }
}
