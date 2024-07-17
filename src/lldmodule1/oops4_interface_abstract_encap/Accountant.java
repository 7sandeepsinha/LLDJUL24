package lldmodule1.oops4_interface_abstract_encap;

public class Accountant {
    private int id;
    private String name;
    private int salary;
    private String department;

    public int getId() {
        // write the logic to verify your userName and password
        System.out.println("Getting Accountant ID");
        return id;
    }

    public void setId(int id) {
        // write the logic to verify your userName and password
        if(id <= 0 ){
            System.out.println("Invalid Id");
            return;
        }
        System.out.println("Setting Accountant ID");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
