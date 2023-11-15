package Iterators;

import Pokemon.Pokemon;

public class IterateurTableau implements Iterateur{
    private int index;
    private Pokemon[] pokemons;
    @Override
    public boolean hasNext() {
        return pokemons[index] != null;
    }

    @Override
    public Pokemon next() {
        return pokemons[index++];
    }

    public IterateurTableau(Pokemon[] pokemons){
        this.pokemons = pokemons;
        this.index = 0;
    }
}
