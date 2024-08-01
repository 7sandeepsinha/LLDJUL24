package lldmodule1.advancedJavaTopics;

public class Pant {
    private int id;
    private int size;
    private double mrp;

    public Pant(int id, int size, double mrp) {
        this.id = id;
        this.size = size;
        this.mrp = mrp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getMrp() {
        return mrp;
    }

    public void setMrp(double mrp) {
        this.mrp = mrp;
    }

    @Override
    public String toString() {
        return "Pant{" +
                "id=" + id +
                ", size=" + size +
                ", mrp=" + mrp +
                '}';
    }
}
