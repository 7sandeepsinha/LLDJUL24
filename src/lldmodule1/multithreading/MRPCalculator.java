package lldmodule1.multithreading;

import java.util.concurrent.Callable;

public class MRPCalculator implements Callable<Integer> {
    private int productId;

    public MRPCalculator(int id) {
        productId = id;
    }

    @Override
    public Integer call() throws InterruptedException {
        System.out.println("MRP for Product ID : " + productId +
                ", found with thread : " +
                Thread.currentThread().getName());
        return 100;
    }
}
