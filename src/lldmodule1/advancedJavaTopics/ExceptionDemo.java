package lldmodule1.advancedJavaTopics;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public class ExceptionDemo {

    public void method1(){
        try {
            throw new SQLException();
            // Unhandled exception: java.sql.SQLException
        }catch (SQLException e){
            System.out.println("Handled SQL exception");
        }
    }

    public void method3() throws SQLException{
        throw new SQLException();
    }

    public void method2(){
        throw new NullPointerException(); // Unchecked exception
    }

    public void method4(){
        Scanner sc = null;
        try {
            sc = new Scanner(System.in); // resource remains occupied if not cleaned until garbage collector cleans it
            throw new ArithmeticException();
        } catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("Caught array index exception");
        } finally {
            // finally block always executes, used for closing of resources
            System.out.println("Finally block always executes");
            sc.close();
        }
    }

    public void method5(){
        try (Scanner sc = new Scanner(System.in)) { // try with resources, the moment try block completes or throws an exception the resources are automatically closed
            // resource remains occupied if not cleaned until garbage collector cleans it
            throw new ArithmeticException();
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("Caught array index exception");
        }
    }
}
