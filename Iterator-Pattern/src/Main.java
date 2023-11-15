import Iterators.Iterateur;
import Pokemon.PokemonNP;
import Pokemon.PokemonXP;

public class Main {
    public static void main(String[] args) {
        PokemonXP xp = new PokemonXP();
        PokemonNP np = new PokemonNP();

        xp.ajouterPokemon("Salameche");
        xp.ajouterPokemon("Bulbizarre");
        xp.ajouterPokemon("Carapuce");

        np.ajouterPokemon("Dracaufeu");
        np.ajouterPokemon("Florizard");
        np.ajouterPokemon("Tortank");

        Iterateur iterateurXP = xp.iterateur();
        Iterateur iterateurNP = np.iterateur();

        while(iterateurXP.hasNext()) System.out.println(iterateurXP.next().getNom());
        while(iterateurNP.hasNext()) System.out.println(iterateurNP.next().getNom());
    }
}