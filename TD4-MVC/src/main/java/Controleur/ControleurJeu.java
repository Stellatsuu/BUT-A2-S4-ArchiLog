package Controleur;

import Objets.Pokemon;

public class ControleurJeu implements Controleur {

    private Pokemon pokemon;

    public ControleurJeu(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public void attaquer() {
        pokemon.attaquer();
    }

    @Override
    public void soigner() {
        pokemon.soigner();
    }

    @Override
    public void pokemons() {
        pokemon.pokemons();
    }
}
