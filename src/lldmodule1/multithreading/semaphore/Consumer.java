package lldmodule1.multithreading.semaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{

    private Queue<Shirt> store;
    private String name;
    private Semaphore semaProducer;
    private Semaphore semaConsumer;

    public Consumer(Queue<Shirt> store, String name, Semaphore semaProducer, Semaphore semaConsumer) {
        this.store = store;
        this.name = name;
        this.semaProducer = semaProducer;
        this.semaConsumer = semaConsumer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                semaConsumer.acquire(); // consumer enters and acquires a key, consumer that can enter further n-1
                System.out.println("Current size : " +
                        store.size() +
                        ", removing a shirt by consumer : " + name);
                store.remove();
                semaProducer.release();// producer can enter post a shirt is bought, so producer that can enter after here is n+1
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
