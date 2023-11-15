package Etats;

import Objets.Pokemon;

import java.util.Random;

public class Endormi extends Etat {
    public Endormi(Pokemon p) {
        super(p);
    }

    @Override
    public void attaquer() {
        //perds entre 1 et 10 pv par attaque
        pokemon.setPv(pokemon.getPv() - (1 + new Random().nextInt(10)));
    }
}
