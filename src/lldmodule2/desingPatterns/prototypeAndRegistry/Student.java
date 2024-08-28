package lldmodule2.desingPatterns.prototypeAndRegistry;

public class Student implements Prototype<Student> {
    private int id;
    private String name;
    private double psp;
    private String batchName;
    // private Address address;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    @Override
    public Student clone() {
        Student copy = new Student();
        copy.id = this.id;
        copy.name = this.name;
        copy.psp = this.psp;
        copy.batchName = this.batchName;
        // create a deep copy for address object
        return copy;
    }
}
