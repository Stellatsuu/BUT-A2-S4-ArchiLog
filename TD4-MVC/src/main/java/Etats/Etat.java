package Etats;

import Objets.Pokemon;

public abstract class Etat {

    Pokemon pokemon;

    public Etat(Pokemon p) {
        this.pokemon = p;
    }

    public void attaquer() {
        System.out.println("Ce pokemon ne peut pas attaquer actuellement.");
    }

    public void soigner() {
        int pvARendre = pokemon.getStrategiePotion().getPV(pokemon);
        pokemon.setPv(Math.min(pvARendre + pokemon.getPv(), pokemon.getPvmax()));
        pokemon.setEtat(new Normal(pokemon));
    }
}
