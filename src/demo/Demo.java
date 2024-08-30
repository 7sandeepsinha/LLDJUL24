package demo;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
         Car car = new ElectricCar(1, "Some", "Thing");
    }

    public static Car getCar(){
        int rand = (int) (Math.random() * 100);
        if(rand % 2 == 0 ){
            return new Car(1, "Normal Car");
        } else {
            return new ElectricCar(2, "Electric Car", "Honda");
        }
    }

    public static void doSomething(List<Integer> list) {
        // doing something that only needs List behaviour
    }

    public static void doSomethingSpecific(ArrayList<Integer> arrayList) {
        // doing something that only available in ArrayList
    }
}

// List parent type -> ArrayList child || wont be able to use functionalities present in ArrayList
// only would be able to use functionalities in list type
// completely depends on the need

