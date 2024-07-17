package lldmodule1.oops4_interface_abstract_encap;

public class PetrolCar implements ICar{
    @Override
    public void startEngine(){
        System.out.println("Starting engine in PetrolCar");
    }

    @Override
    public void startAC() {
        System.out.println("Staring AC in PetrolCar");
    }

    @Override
    public boolean setTemp(int temp) {
        System.out.println("Setting the temp in PetrolCar to " + temp);
        return true;
    }

    @Override
    public int getTemp() {
        System.out.println("Display temp in PetrolCar");
        return 10;
    }
}
