package lldmodule1.oops4_interface_abstract_encap;

public class HybridCar implements ICar{

    @Override
    public void startEngine(){
        System.out.println("Starting engine in HybridCar");
    }

    @Override
    public void startAC() {
        System.out.println("Staring AC in HybridCar");
    }

    @Override
    public boolean setTemp(int temp) {
        System.out.println("Setting the temp in HybridCar to " + temp);
        return true;
    }

    @Override
    public int getTemp() {
        System.out.println("Display temp in hybrid car");
        return 10;
    }
}

//Class 'HybridCar' must implement abstract method 'startEngine()' in 'ICar'
//Class 'HybridCar' must implement abstract method 'startAC()' in 'ICar'