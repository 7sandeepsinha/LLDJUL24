package lldmodule1.advancedJavaTopics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pant> pants = new ArrayList<>();
        Pair<Integer, Integer> intPair = new Pair<>();
        intPair.print();

        Pant p = new Pant(1, 32, 2000.00);
        Shirt s = new Shirt(2, 42, "BLUE", 1200.00);
        Pair<Pant, Shirt> shirtPantPair = new Pair<>(p, s);
        shirtPantPair.print();

        HashMap<Integer, String> studentDetails = new HashMap<>();
        studentDetails.put(1, "Sagar");

//        Raw DataTypes
//        HashMap map  = new HashMap(); // Raw use of parameterized class 'HashMap'
//        map.put("Nitish", "CM");

        Animal animalObj = new Animal("Ranbir");

        AnimalJump<Animal> animalJump = new AnimalJump<>(); // animalJumpAttribute is of type Animal
        animalJump.setAnimalJumpAttribute(animalObj);
        animalJump.jump();

        Dog dogObj = new Dog("Doga", 2);
        animalJump.setAnimalJumpAttribute(dogObj);

        AnimalJump<Object> animalJumpObject = new AnimalJump<>();
        // dont randomly push data types in generics be as specific as possible

        List<Dog> dogs = new ArrayList<>();

        Main main = new Main();
        // main.doSomething(dogs); // passing object of arrayList<Dog>
        // upcasting not supported here as arrayList<Dog> and arrayList<Animal>
        // are two separate objects not related to each other

        main.doStuff(dogObj); // this works -> upcasting

    }

    public void doSomething(List<Animal> animals){ // expecting an object of arraylist<Animal>
        System.out.println("Do something");
    }

    public void doSomething2(List<Object> animals){
        System.out.println("Do something");
    }

    public void doStuff(Animal a){
        System.out.println("Do stuff");
    }
}

// whenever we call an object, java calls toString method of that object, and prints the returned string
// toString() lies in Object class

// break -> Generics Inheritance, and Type Erasure