package lldmodule1.oops3_inheritance_polymorphism;

public class Calculator {
    public void add(int a, int b){
        System.out.println("Result : " + (a+b));
    }

    public void add(int a, double b){
        System.out.println("Result : " + (a+b));
    }

    public void add(double a, int b){
        System.out.println("Result : " + (a+b));
    }

    public void add(double a, double b){
        System.out.println("Result : " + (a+b));
    }
}
