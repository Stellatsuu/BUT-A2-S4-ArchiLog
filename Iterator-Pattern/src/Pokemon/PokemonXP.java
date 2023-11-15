package Pokemon;

import Iterators.IterateurListe;
import Iterators.IterateurTableau;

public class PokemonXP {

    private static final int MAX_POKEMONS = 6;
    private Pokemon[] tabPokemons;
    private int nbPokemons = 0;

    public PokemonXP(){
        this.tabPokemons = new Pokemon[MAX_POKEMONS];
    }

    public int getNbPokemons(){
        return nbPokemons;
    }

    public void ajouterPokemon(String nom){
        Pokemon p = new Pokemon(nom);
        if(nbPokemons >= MAX_POKEMONS){
            System.out.println("Trop de pokemons");
        } else {
            tabPokemons[nbPokemons] = p;
            nbPokemons++;
        }
    }

    public IterateurTableau iterateur(){
        return new IterateurTableau(tabPokemons);
    }
}
