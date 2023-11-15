public class FaireCafe implements Commande{

    private MachineCafe machineCafe;

    public FaireCafe(MachineCafe machineCafe){
        this.machineCafe = machineCafe;
    }
    @Override
    public void executer() {
        machineCafe.faireCafe();
    }

    @Override
    public void annuler() {
        machineCafe.eteindre();
    }
}
