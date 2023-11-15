package Pokemon;

import Iterators.IterateurListe;

import java.util.ArrayList;
import java.util.List;

public class PokemonNP {

    private List<Pokemon> listePokemon;

    public PokemonNP(){
        listePokemon = new ArrayList<Pokemon>();
    }

    public List<Pokemon> getPokemon(){ return listePokemon; };

    public void ajouterPokemon(String nom){
        Pokemon p = new Pokemon(nom);
        listePokemon.add(p);
    }

    public IterateurListe iterateur(){
        return new IterateurListe(listePokemon);
    }
}
