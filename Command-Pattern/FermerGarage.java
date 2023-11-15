public class FermerGarage implements Commande{

    private PorteGarage garage;

    public FermerGarage(PorteGarage garage){
        this.garage = garage;
    }
    @Override
    public void executer() {
        garage.fermer();
    }

    @Override
    public void annuler(){
        garage.ouvrir();
    }
}
