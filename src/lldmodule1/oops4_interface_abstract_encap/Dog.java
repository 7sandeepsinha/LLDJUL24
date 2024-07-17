package lldmodule1.oops4_interface_abstract_encap;

public class Dog extends Animal{
    public void sniff(){
        System.out.println("Dog is sniffing");
    }

    @Override
    public void eat(){
        System.out.println("Dog is eating food");
    }
}
