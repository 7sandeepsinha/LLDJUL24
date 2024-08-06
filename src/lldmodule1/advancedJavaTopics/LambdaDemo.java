package lldmodule1.advancedJavaTopics;

public class LambdaDemo {
    public static void main(String[] args) {
        // ******** ANONYMOUS CLASS DEMO ***********
        /*
        //anonymous class impl
        Vehicle vehicle = new Vehicle() { // Anonymous class derived from Vehicle [ Vehicle -> Anonymous class]
            // object of class Anonymous, and upcasted to reference variable of parent[Vehicle]
            public void startEngine(){
                System.out.println("Engine is started in anonymous class");
            }
            public void run(){
                System.out.println("Running the vehicle in anonymous class");
            }
        };

        vehicle.startEngine();
        vehicle.run();

        Vehicle electricVehicle = new Vehicle() { // Anonymous class derived from Vehicle [ Vehicle -> Anonymous class]
            public void startEngine(){
                System.out.println("No Engine only motor");
            }
            public void run(){
                System.out.println("Running on battery");
            }
        };

        electricVehicle.startEngine();
        electricVehicle.run();
         */

        // ******** LAMBDA FORMATION STEPS DEMO ***********
        /*
        // older way of doing things
        Printer printer = new Printer();
        Thread thread = new Thread(printer);
        thread.start();

        // lambda way of doing things
        Thread printerThread = new Thread(() -> {
            System.out.println("Hello World from : " + Thread.currentThread().getName());
        });
        printerThread.start();

        //  Step 1 -> by using anonymous class, we dont need the Printer class anymore.
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Printing from runnable anonymous class");
            }
        };
        Thread t = new Thread(runnable);
        t.start();

        // Step2 -> reduce the runnable variable line of code
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printing from runnable anonymous class" +
                        " directly while creating thread object");
            }
        });
        t1.start();
        // IDEA -> If I have functional interface, ie, an interface with a single abs method,
        // then any implementation we are creating, would be obviously for the single abs method
        // so, there should be no need to give the name for that method

        // Step3 -> remove method name, and signature, just pass the implementation
        // if its a single line method, there is no need for {}
        Thread t2 = new Thread(() -> System.out.println("Printing from runnable anonymous class"
                + " directly while creating thread object"));
        t2.start();

         */

        MathOperation addition = (a,b) -> a + b; // return keyword is not needed for a single line method
        MathOperation subtraction = (a,b) -> a - b;

        calculate(10, 15, (a,b) -> a+b);
        calculate(10, 15, (a,b) -> a-b);

        calculate(10, 15, (a) -> a*a);
    }

    public static void calculate(int a, int b, MathOperation mathOperationObject){
        System.out.println("Calculate method for mathoperation");
        System.out.println(mathOperationObject.operate(a, b));
    }

    public static void calculate(int a, int b, MathCalculate mathCalculate){
        System.out.println("Calculate method for MathCalculate");
        System.out.println(mathCalculate.square(a));
    }
}
// Parent class/interface -> MathOperation
// 2 class -> Addition, Subtraction
// created the objects of each class separately
// passed those objects in the calculate method
