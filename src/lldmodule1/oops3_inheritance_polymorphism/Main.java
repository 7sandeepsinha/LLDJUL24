package lldmodule1.oops3_inheritance_polymorphism;

public class Main {
    public static void main(String[] args) {
        Cat c = new Cat(4);
        c.name = "Bheegi Billi";
        c.noOfLegs = 4;
        // c.color = "Orange"; -> not doable

        c.drink();
        c.eat();
        // c.sleep(); -> not doable

        Calculator calculator = new Calculator();
        calculator.add(10,15);
        calculator.add(10,15.5);
        calculator.add(10.2,15.5);
        calculator.add(10.2,15);

        Car petrolCar = new Car();
        petrolCar.startCar();

        ElectricCar electricCar = new ElectricCar();
        electricCar.startCar();
    }
}
