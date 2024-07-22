package lldmodule1.multithreading;

public class NumberPrinter implements Runnable {
    private int x;

    public NumberPrinter(int number) {
        x = number;
    }

    @Override
    public void run() {
        System.out.println("Number : " + x +
                ", print by thread : " +
                Thread.currentThread().getName());
    }
}
