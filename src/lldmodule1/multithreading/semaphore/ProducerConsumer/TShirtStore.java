package lldmodule1.multithreading.semaphore.ProducerConsumer;

import java.util.concurrent.Semaphore;

public class TShirtStore {
    private static final int STORE_CAPACITY = 5;
    private static Semaphore mutex = new Semaphore(1); // Controls access to critical sections
    private static Semaphore empty = new Semaphore(STORE_CAPACITY); // Represents empty slots in the store
    private static Semaphore full = new Semaphore(0); // Represents filled slots in the store
    private static int tShirtCount = 0;

    static class Producer implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    empty.acquire(); // Wait for an empty slot
                    mutex.acquire(); // Enter critical section

                    // Produce a T-shirt
                    System.out.println("Producer produces a T-shirt. Total T-shirts: " + ++tShirtCount);

                    mutex.release(); // Exit critical section
                    full.release(); // Signal that a T-shirt is ready to be consumed
                    Thread.sleep(1000); // Simulate production time
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Consumer implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    full.acquire(); // Wait for a T-shirt to be available
                    mutex.acquire(); // Enter critical section

                    // Consume a T-shirt
                    System.out.println("Consumer buys a T-shirt. Total T-shirts: " + --tShirtCount);

                    mutex.release(); // Exit critical section
                    empty.release(); // Signal that a slot is available for production
                    Thread.sleep(1500); // Simulate consumption time
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread producerThread = new Thread(new Producer());
        Thread consumerThread = new Thread(new Consumer());

        producerThread.start();
        consumerThread.start();
    }
}
