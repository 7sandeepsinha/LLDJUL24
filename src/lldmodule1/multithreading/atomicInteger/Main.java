package lldmodule1.multithreading.atomicInteger;


import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count(new AtomicInteger(0));
        Adder adder1 = new Adder(count);
        Adder adder2 = new Adder(count);
        Subtractor subtractor1 = new Subtractor(count);
        Subtractor subtractor2 = new Subtractor(count);

        Thread adderThread = new Thread(adder1);
        Thread subtractorThread = new Thread(subtractor1);

        Thread adderThread2 = new Thread(adder2);
        Thread subtractorThread2 = new Thread(subtractor2);

        adderThread.start();
        adderThread2.start();
        subtractorThread.start();
        subtractorThread2.start();

        adderThread.join();
        adderThread2.join();
        subtractorThread.join();
        subtractorThread2.join();

        System.out.println(count.getValue().get());
    }
}
