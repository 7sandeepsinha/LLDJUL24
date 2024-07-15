package lldmodule1.oops3_inheritance_polymorphism;

public class ElectricCar extends Car {

    @Override // only for readability, has no effect on override
    public void startCar(){ // same method signature startCar()
        // method logic should be updated
        System.out.println("Electric motor is starting");
    }
}
/*
        Parent
        10

        Child
        needs all 10
        but 2 needs to be updated

        1. Write all 10 [8 + 2] in child class
        2. Inherit all 10
        3. Inherit all 10 but override 2

        parent
        music(){
                // 1
                // 2
        }

        child
        music(){
            super.music(); //1 //2
            // 3
        }
 */