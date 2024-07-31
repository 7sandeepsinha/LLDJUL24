package lldmodule1.advancedJavaTopics;

public class Shirt {
    private int id;
    private int size;
    private String colorType;
    private double mrp;

    public Shirt(int id, int size, String colorType, double mrp) {
        this.id = id;
        this.size = size;
        this.colorType = colorType;
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

    public String getColorType() {
        return colorType;
    }

    public void setColorType(String colorType) {
        this.colorType = colorType;
    }

    public double getMrp() {
        return mrp;
    }

    public void setMrp(double mrp) {
        this.mrp = mrp;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "id=" + id +
                ", size=" + size +
                ", colorType='" + colorType + '\'' +
                ", mrp=" + mrp +
                '}';
    }
}
