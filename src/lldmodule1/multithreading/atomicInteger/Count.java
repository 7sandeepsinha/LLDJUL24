package lldmodule1.multithreading.atomicInteger;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;

public class Count {
    private AtomicInteger value;
    private AtomicBoolean atomicBoolean;
    private AtomicLong atomicLong;
    private AtomicIntegerArray atomicIntegerArray;

    public Count(AtomicInteger value) {
        this.value = value;
    }

    public AtomicInteger getValue() {
        return value;
    }

    public void setValue(AtomicInteger value) {
        this.value = value;
    }
}
