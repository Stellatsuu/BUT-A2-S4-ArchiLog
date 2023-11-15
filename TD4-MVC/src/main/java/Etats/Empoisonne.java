package Etats;

import Objets.Pokemon;

import java.util.Random;

public class Empoisonne extends Etat {
    public Empoisonne(Pokemon p) {
        super(p);
    }

    @Override
    public void attaquer() {
        //perds entre 1 et 15 pv par attaque
        pokemon.setPv(pokemon.getPv() - (1 + new Random().nextInt(15)));
    }
}
