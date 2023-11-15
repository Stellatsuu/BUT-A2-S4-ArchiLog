package Etats;

import Objets.Pokemon;

import java.util.Random;

public class Normal extends Etat {

    public Normal(Pokemon p) {
        super(p);
    }

    public void attaquer() {
        int i = new Random().nextInt(4);
        switch (i) {
            case 0 -> {
                pokemon.setEtat(new Paralyse(pokemon));
                //perds entre 10 et 50 pv en passant paralysé
                pokemon.setPv(pokemon.getPv() - (10 + new Random().nextInt(50)));
            }
            case 1 -> {
                pokemon.setEtat(new Empoisonne(pokemon));
                //perds entre 10 et 75 pv en passant empoisonné
                pokemon.setPv(pokemon.getPv() - (10 + new Random().nextInt(75)));
            }
            case 2 -> {
                pokemon.setEtat(new Endormi(pokemon));
                //perds entre 10 et 35 pv en passant endormi
                pokemon.setPv(pokemon.getPv() - (10 + new Random().nextInt(35)));
            }
            //perds entre 10 et 20 pv
            case 3 -> pokemon.setPv(pokemon.getPv() - (10 + new Random().nextInt(20)));
        }
    }
}
