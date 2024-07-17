package lldmodule1.oops4_interface_abstract_encap;

import lldmodule1.oops3_inheritance_polymorphism.A;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog(); //implicit casting || upcasting

        a.eat(); // executes the overridden method, basically executing the functionality from the newer TV
        a.drink();
        // a.sniff(); Cant call this method, as it is not part of parent
        // basically, older remote cant call newer features in new TV


        // Car - 2
//         ElectricCar - 3 [1 own, 1 overridden, 1 inherited]
        ElectricCar car = (ElectricCar) new Car(); // explicit casting || downcasting
        car.startAC();
        car.startEngine();
        car.chargeBattery();

        Accountant accountant = new Accountant();
        //accountant.id = 10;
        //System.out.println("Accountant Id : " + accountant.id);

        System.out.println("Accountant Id : " + accountant.getId());
        accountant.setId(10);
        // accoutant.setId(-100);

        // all methods in interface will definitely have implementation in its child class ? YES
        // all buttons in the older remote, have functionality in the newer TV
        System.out.println("Choose your car : 1. Hybrid and 2. Petrol");
        Scanner sc = new Scanner(System.in);
        int carType = sc.nextInt();
        ICar iCar = null;
        if(carType == 1){
            iCar = new HybridCar();
        } else {
            iCar = new PetrolCar();
        }
        iCar.startEngine();
        iCar.startAC();
        iCar.setTemp(10);
        iCar.getTemp();
    }
}
// RefClass varName = new ClassName();
// A a = new C(); B b = (B) a; C c = (C) a; D d = (D) a; }

// A a = new C(); -- a address of C obj
// B b = (B) a ;
// C c = (C) a;
// D d = (D) a;