package lldmodule1.multithreading.semaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{

    private Queue<Shirt> store;
    private String name;
    Semaphore semaProducer;
    Semaphore semaConsumer;

    public Producer(Queue<Shirt> store, String name, Semaphore semaProducer, Semaphore semaConsumer) {
        this.store = store;
        this.name = name;
        this.semaProducer = semaProducer;
        this.semaConsumer = semaConsumer;
    }

    @Override
    public void run() {
        while(true) {
            try {
                semaProducer.acquire(); // producer enters and acquires a key, producer that can enter further n-1
                System.out.println("Current size : " + // P1
                        store.size() +
                        ", adding a shirt by producer : " + name);
                store.add(new Shirt());
                semaConsumer.release(); // consumer can enter post a shirt is added, so consumers that can enter after here is n+1
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
