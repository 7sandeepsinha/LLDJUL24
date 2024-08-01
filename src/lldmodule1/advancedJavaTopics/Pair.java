package lldmodule1.advancedJavaTopics;

public class Pair<X,Y> {
    private X first; // X = pant
    private Y second; // Y = shirt

    public Pair() {
    }

    public Pair(X first, Y second) {
        this.first = first;
        this.second = second;
    }

    public void print(){
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
    }

    public void updateFirst(X first){
        this.first = first;
    }

    public void updateSecond(Y second){
        this.second = second;
    }

    public X getFirst(){
        return first;
    }

    public Y getSecond(){
        return second;
    }

}
