package lldmodule1.multithreading.semaphore;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Queue<Shirt> store = new ConcurrentLinkedDeque<>();

        // beginning, store is empty
        Semaphore semaProducer = new Semaphore(2); // producer allowed to add 5 shirts as store is empty
        Semaphore semaConsumer = new Semaphore(0); // consumer not allowed to buy/enter as store is empty

        Producer p1 = new Producer(store, "P1", semaProducer, semaConsumer);
        Producer p2 = new Producer(store, "P2", semaProducer, semaConsumer);
        Producer p3 = new Producer(store, "P3", semaProducer, semaConsumer);
        Producer p4 = new Producer(store, "P4", semaProducer, semaConsumer);
        Producer p5 = new Producer(store, "P5", semaProducer, semaConsumer);

        Thread tp1 = new Thread(p1);
        Thread tp2 = new Thread(p2);
        Thread tp3 = new Thread(p3);
        Thread tp4 = new Thread(p4);
        Thread tp5 = new Thread(p5);

        Consumer c1 = new Consumer(store, "C1", semaProducer, semaConsumer);
        Consumer c2 = new Consumer(store, "C2", semaProducer, semaConsumer);
        Consumer c3 = new Consumer(store, "C3", semaProducer, semaConsumer);
        Consumer c4 = new Consumer(store, "C4", semaProducer, semaConsumer);
        Consumer c5 = new Consumer(store, "C5", semaProducer, semaConsumer);

        Thread tc1 = new Thread(c1);
        Thread tc2 = new Thread(c2);
        Thread tc3 = new Thread(c3);
        Thread tc4 = new Thread(c4);
        Thread tc5 = new Thread(c5);

        tp1.start();
        tc4.start();
        tp2.start();
        tp3.start();
        tc2.start();
        tc3.start();
        tp4.start();
        tp5.start();
        tc5.start();
        tc1.start();
    }
}
// ConcurrentLinkedDeque -> makes a multi-thread enabled queue
// multiple threads can read/write/update/etc on the queue at the same time
// Normal LL does not allow multiple read/write at the same time, only allows multiple reads
// Either of them are not thread safe [ face synchronisation issue ]