package lldmodule1.oops3_inheritance_polymorphism;

public class Animal {
    public int noOfLegs;
    public String name;
    private String color;

    public Animal(int animalLegsCount){
        noOfLegs = animalLegsCount;
    }

    public Animal(String aName, int animalLegsCount){
        noOfLegs = animalLegsCount;
        name = aName;
    }

    public void drink(){
        System.out.println(name + " is drinking water");
    }

    public void eat(){
        System.out.println(name + " is eating food");
    }

    private void sleep(){
        System.out.println(name + " is sleeping");
    }
}
