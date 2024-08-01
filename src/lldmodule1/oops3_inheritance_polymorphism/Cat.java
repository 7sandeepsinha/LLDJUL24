package lldmodule1.oops3_inheritance_polymorphism;

public class Cat extends Animal {
    public Cat(int legs) {
        super(legs); // super has to be the first line of constructor
    }
}
// Cannot inherit from final 'lldmodule1.oops3_inheritance_polymorphism.Animal'