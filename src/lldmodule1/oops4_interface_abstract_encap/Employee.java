package lldmodule1.oops4_interface_abstract_encap;

public abstract class Employee {
    private int id;
    private String name;
    private int salary;

    public void drawSalary(){
        System.out.println("Employee will draw salary at the end of the month");
    }

    public abstract void doingTasks();
}
