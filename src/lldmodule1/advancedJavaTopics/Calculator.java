package lldmodule1.advancedJavaTopics;

public class Calculator {
    public void divide(int a, int b, Student student){
        try{ // cant have just a try block
            System.out.println(a/b); // arithmetic exception
            System.out.println(student.getName()); // null pointer exception
        } catch (ArithmeticException ae){
//            System.out.println(ae.getMessage());
//            ae.printStackTrace();
            System.out.println("Handled arithmetic exception");
        } catch (NullPointerException ne){
            System.out.println("Handled null pointer exception");
        }
    }

    public void divide2(int a, int b, Student student){
        try{ // cant have just a try block
            System.out.println(a/b); // arithmetic exception
            System.out.println(student.getName()); // null pointer exception
        } catch (ArithmeticException | NullPointerException ex){
//            System.out.println(ae.getMessage());
//            ae.printStackTrace();
            System.out.println("Handled exception");
        }
    }

    public void divide3(int a, int b, Student student){
        try{ // cant have just a try block
            System.out.println(a/b); // arithmetic exception
            System.out.println(student.getName()); // null pointer exception
            // throws random exception
        } catch (Exception ex){
//            System.out.println(ae.getMessage());
//            ae.printStackTrace();
            System.out.println("Handled exception");
        }
    }

    public void divide(int a, int b) throws ArithmeticException { // throws - propagating upwards, not generating an exception
        try {
            if (b == 0) {
                throw new ArithmeticException("Denominator is 0"); // generates and throws an exception
            }
            System.out.println("Hello world");
            System.out.println("Some DB fetch");
            System.out.println(a / b); // arithmetic exception
        } catch (ArithmeticException ae){
            System.out.println("Log some data"); // log the variables
            throw new ArithmeticException(ae.getMessage());
        }
    }


    public void calculate(int a, int b, String operation) throws ArithmeticException{
        if (operation.equals("DIVIDE")) {
            divide(a, b);
        }
    }
}
// final, finally, finalise
// try with resources