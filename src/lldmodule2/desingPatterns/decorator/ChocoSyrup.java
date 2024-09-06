package lldmodule2.desingPatterns.decorator;

public class ChocoSyrup implements IceCream{
    private IceCream iceCream;

    public ChocoSyrup(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 20;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + "Choco Syrup, ";
    }
}
