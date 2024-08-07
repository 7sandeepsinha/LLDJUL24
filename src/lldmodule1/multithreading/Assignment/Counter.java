package lldmodule1.multithreading.Assignment;

public class Counter {
    private int count;

    public Counter(int count){
        this.count=count;
    }

    public synchronized void  incValue(int offset){
        this.count=this.count+offset;
    }

    public synchronized int getValue(){
        return this.count;
    }

    public synchronized void decValue(int offset){
        this.count=this.count-offset;

    }
}
