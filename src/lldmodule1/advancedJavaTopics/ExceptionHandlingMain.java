package lldmodule1.advancedJavaTopics;

public class ExceptionHandlingMain {
    public static void main(String[] args) throws ArithmeticException{
        Calculator c = new Calculator();
        System.out.println("_________________");

//        Student student = new Student("Jitendra");
//        PrinterData printerData = new PrinterData();
//        printerData.printStudent(student);
//        printerData.printStudent(null);
        //c.divide(10,0, null);
       // c.divide2(10,10, null);
        try {
            c.calculate(10, 0, "DIVIDE");
        }catch (ArithmeticException ae){
            System.out.println("Handled arithmetic exception");
        }
       // c.calculate(10, 0, "DIVIDE");

        ExceptionDemo demo = new ExceptionDemo();
        demo.method4();
    }
}
