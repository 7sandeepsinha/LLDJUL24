package lldmodule1.oops2_accessModifiers_constructors;

import lldmodule1.oops3_inheritance_polymorphism.A;

public class Student {
     public int rollNo;
     public String name;
     public int rank;
     public Address address;

     public Student(Student student){
         rollNo = student.rollNo;
         name = student.name;
         rank = student.rank;
         Address newAddress = new Address(student.address.street, student.address.city);
         address = newAddress;
         // address = new Address(student.address.street, student.address.city);
     }

     public Student(){
     }

     public Student(int sRoll, int sRank, String sName, Address sAddress){
         rollNo = sRoll;
         rank = sRank;
         name = sName;
         address = sAddress;
     }

     public void updateAddress(String cityName){
         address.city = cityName;
     }

    public void printDetails(){
        System.out.println("Student details : ");
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Name : " + name);
        System.out.println("Rank : " + rank);
        System.out.println("Address : " + address.street + " " + address.city);
    }
}
// private -> only inside the same class, nowhere else
// public -> Access anywhere
// default -> package-private