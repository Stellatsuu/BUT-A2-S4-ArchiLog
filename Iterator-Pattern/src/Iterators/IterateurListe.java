package Iterators;

import Pokemon.Pokemon;

import java.util.List;

public class IterateurListe implements Iterateur{
    private int index;
    private List<Pokemon> pokemons;

    public IterateurListe(List<Pokemon> pokemons) {
        this.index = 0;
        this.pokemons = pokemons;
    }

    @Override
    public boolean hasNext() {
        return index < pokemons.size();
    }

    @Override
    public Pokemon next() {
        return pokemons.get(index++);
    }
}
