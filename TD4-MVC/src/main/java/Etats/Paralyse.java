package Etats;

import Objets.Pokemon;

import java.util.Random;

public class Paralyse extends Etat {
    public Paralyse(Pokemon p) {
        super(p);
    }

    @Override
    public void attaquer() {
        //25% de chance de perdre le statut
        if (new Random().nextInt(4) == 0) {
            pokemon.setEtat(new Normal(pokemon));
        } else {
            //perds entre 10 et 25 pv en restant paralysé
            pokemon.setPv(pokemon.getPv() - (10 + new Random().nextInt(25)));
        }
    }
}
