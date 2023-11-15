package Objets;

import Etats.Etat;
import Etats.Normal;
import Strategies.StrategiePotion;
import Vues.Observateur;

import java.util.ArrayList;

public class Pokemon {
    private String nom;
    private int pv;
    private int pvmax;
    private ArrayList<Observateur> ecouteurs;
    private Etat etat;
    private StrategiePotion strategiePotion;

    public Pokemon(String nom, int pvmax, StrategiePotion sp) {
        this.nom = nom;
        this.pv = pvmax;
        this.pvmax = pvmax;
        this.ecouteurs = new ArrayList<>();
        this.etat = new Normal(this);
        this.strategiePotion = sp;
    }

    private void notifier() {
        for (Observateur o : ecouteurs) {
            o.update(this);
        }
    }

    public void bind(Observateur o) {
        this.ecouteurs.add(o);
    }

    public void setEtat(Etat e) {
        this.etat = e;
    }

    public Etat getEtat() {
        return this.etat;
    }

    public void setStrategiePotion(StrategiePotion sp) {
        this.strategiePotion = sp;
    }

    public StrategiePotion getStrategiePotion() {
        return this.strategiePotion;
    }

    public void attaquer() {
        etat.attaquer();
        notifier();
    }

    public void soigner() {
        etat.soigner();
        notifier();
    }

    public void pokemons() {
        //TODO
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getPv() {
        return this.pv;
    }

    public int getPvmax() {
        return this.pvmax;
    }

    public String getNom() {
        return this.nom;
    }
}
