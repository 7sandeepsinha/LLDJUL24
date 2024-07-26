package lldmodule1.multithreading.atomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class Adder implements Runnable{

    private Count count;

    public Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=1;i<=1000;i++){
            count.getValue().getAndIncrement();
        }
    }
}
