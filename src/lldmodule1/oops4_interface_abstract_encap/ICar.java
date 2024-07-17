package lldmodule1.oops4_interface_abstract_encap;

public interface ICar {
    void startEngine();
    void startAC();
    boolean setTemp(int temp);
    int getTemp();
}

// all methods are by default public
// Modifier 'public' is redundant for interface members