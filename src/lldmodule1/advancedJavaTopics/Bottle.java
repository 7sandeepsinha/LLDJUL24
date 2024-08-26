package lldmodule1.advancedJavaTopics;

public class Bottle {
    private int size;
    private static int price;

    public void printData(){ // non-static
        System.out.println("Size : " + size); // able to access non-static attribute
        System.out.println("Price : " + price); // able to access static attribute

        getSize(); // able to call non-static method
        getPrice(); // able to call static method
    }

    public static void printInfo(){ // non-static
        //System.out.println("Size : " + size); // Non-static field 'size' cannot be referenced from a static context
        System.out.println("Price : " + price); // able to access static attribute

        //getSize(); // Non-static method 'getSize()' cannot be referenced from a static context
        getPrice(); // able to call static method
    }




    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static int getPrice() {
        return price;
    }

    public static void setPrice(int price) {
        Bottle.price = price;
    }
}