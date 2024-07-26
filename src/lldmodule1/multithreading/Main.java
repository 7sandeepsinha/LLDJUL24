package lldmodule1.multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*
        HelloWorldPrinter hwp = new HelloWorldPrinter();
        Thread t = new Thread(hwp);
        t.start();
        System.out.println("Hello World from thread : "
                + Thread.currentThread().getName());

        Executor executor = Executors.newFixedThreadPool(10);
        for(int i=1;i<=100;i++){
            if(i == 5 || i == 11 || i == 90){
                System.out.println("Debug");
            }
            NumberPrinter np = new NumberPrinter(i);
            executor.execute(np);
        }


        MRPCalculator mrpCalculator = new MRPCalculator(10);
        DiscountCalculator discountCalculator = new DiscountCalculator(10);
        ExecutorService executor = Executors.newFixedThreadPool(2);


        Future<Integer> futureMrp = executor.submit(mrpCalculator);
        Future<Double> futureDiscount = executor.submit(discountCalculator);

        System.out.println("Print before call from thread : "
                + Thread.currentThread().getName()
                + ", Time : " + LocalDateTime.now());

        //get() is a blocking call
        int mrp = futureMrp.get(); // getting the actual mrp from the future object[promise object]

        System.out.println("Print after call from thread : "
                + Thread.currentThread().getName()
                + ", Time : " + LocalDateTime.now());
        double discount = futureDiscount.get();

        double finalPrice = mrp - (mrp * discount/100);
        System.out.println("Final price : " + finalPrice + ", from thread : " + Thread.currentThread().getName());

         */
        Count c = new Count(0);
        ReentrantLock mutex = new ReentrantLock();

        Adder adder = new Adder(c, mutex);
        Subtractor subtractor = new Subtractor(c, mutex);

        Thread adderThread = new Thread(adder);
        Thread subtractorThread = new Thread(subtractor);

        adderThread.start();
        subtractorThread.start();

        adderThread.join();
        subtractorThread.join();

        System.out.println(c.getValue());
    }
}
