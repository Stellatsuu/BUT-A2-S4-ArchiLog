public class Lampe {

    private String nomPiece;

    public Lampe(String nomPiece){
        this.nomPiece = nomPiece;
    }

    public void allumer(){
        System.out.println("Lampe allumée");
    }

    public void eteindre(){
        System.out.println("Lampe éteinte");
    }
}
