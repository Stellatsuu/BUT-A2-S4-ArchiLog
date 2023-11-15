public class MachineCafe {

    public void allumer(){
        System.out.println("Machine allumée");
    }

    public void eteindre(){
        System.out.println("Machine éteinte");
    }

    public void faireCafe(){
        allumer();
        System.out.println("Café prêt");
        eteindre();
    }
}
