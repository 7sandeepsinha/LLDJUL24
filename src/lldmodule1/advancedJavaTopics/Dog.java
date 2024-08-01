package lldmodule1.advancedJavaTopics;

public class Dog extends Animal{
    private int numberOfLegs;

    public Dog(String name, int numberOfLegs) {
        super(name);
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
}
