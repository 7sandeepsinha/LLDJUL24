package lldmodule2.desingPatterns.decorator;

public class Main {
    public static void main(String[] args) {
        IceCream iceCream = new ChocoChips(
                                new ChocolateScoop(
                                    new VanillaScoop(
                                        new ChocolateCone(
                                            new ChocoSyrup(
                                                new VanillaCone())))));
        //System.out.println("Desc : " + iceCream.getDescription());

        IceCream iceCream1 = new ChocolateScoop(
                                    new VanillaCone());

        System.out.println("Cost : " + iceCream1.getCost());

        //ChocoChips
        // [ChocoScoop
        // [VanillaScoop
        // [ChocoCone
        // [ChocoSyrup
        // [vanilla cone]]]]]
    }
}
// prototype -> deep copy, even for common attributes
// flyweight -> use the same object reference across many other objects
// prototype + flyweight ->
// for common value attributes[intrinsic] create a new class, and keep the object for reuse