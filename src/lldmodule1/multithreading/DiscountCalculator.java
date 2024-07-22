package lldmodule1.multithreading;

import java.util.concurrent.Callable;

public class DiscountCalculator implements Callable<Double> {

    private int productId;

    public DiscountCalculator(int id) {
        productId = id;
    }

    @Override
    public Double call() {
        System.out.println("Discount with Product ID : " + productId +
                ", found with thread : " +
                Thread.currentThread().getName());
        return 20.00;
    }
}
