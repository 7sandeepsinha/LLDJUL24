package lldmodule1.oops2_accessModifiers_constructors;

public class Main {
    public static void main(String[] args) {
        // accessing the attributes and methods
        // inside the same class -> NO
        // inside the same package -> YES
        Address address = new Address("Main Road", "Mumbai");
        Student studentObject = new Student(10, 1, "Shibam", address);

        studentObject.printDetails();

        studentObject.updateAddress("Kolkata");

        System.out.println("----------------------");

        Student studentObject2 = new Student(); // default constructor || no args constructor
        studentObject2.rank = 1;
        studentObject2.rollNo = 10;
        studentObject2.name = "Sagar";
        studentObject2.address = address;

        System.out.println(studentObject2.rank);
        System.out.println(studentObject2.rollNo);
        System.out.println(studentObject2.name);

        System.out.println("----------------------");
        studentObject2.printDetails();

        Iphone iphone11 = new Iphone(11, 13, 55000,
                5000, 6, 3, 12,
                64, "OLED", "6 * 4 * 2");

        Iphone iphone12 = new Iphone(iphone11); // creating a new object using copy constructor

        System.out.println(iphone12.toString());
    }
}

//code -> .java
//.java -> .class -> bytecode -> executed