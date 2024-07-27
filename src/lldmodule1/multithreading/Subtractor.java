package lldmodule1.multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class Subtractor implements Runnable{

    private Count count;
    private ReentrantLock mutex;

    public Subtractor(Count count, ReentrantLock mutex) {
        this.count = count;
        this.mutex = mutex;
    }

    @Override
    public  void run() {
        synchronized (count) {
            for (int i = 1; i <= 1000; i++) {
                // class based lock, will have lesser inconsistency
                count.setValue(count.getValue() - 1);

            }

        }
    }
}
