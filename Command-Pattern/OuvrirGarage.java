public class OuvrirGarage implements Commande{

    private PorteGarage garage;

    public OuvrirGarage(PorteGarage garage){
        this.garage = garage;
    }
    @Override
    public void executer() {
        garage.ouvrir();
    }

    @Override
    public void annuler(){
        garage.fermer();
    }
}
