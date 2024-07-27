package lldmodule1.multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class Adder implements Runnable{

    private Count count;
    private ReentrantLock mutex;

    public Adder(Count count, ReentrantLock mutex) {
        this.count = count;
        this.mutex = mutex;
    }

    @Override
    public void run() {

        synchronized (count) {

            for (int i = 1; i <= 1000; i++) {

                count.setValue(count.getValue() + 1);
            }
        }


    }

}
