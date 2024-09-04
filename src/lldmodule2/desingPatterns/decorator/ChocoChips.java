package lldmodule2.desingPatterns.decorator;

public class ChocoChips implements IceCream{
    private IceCream iceCream;
    private int cost;

    public ChocoChips(IceCream iceCream) {
        this.iceCream = iceCream;
        this.cost = iceCream.getCost() + 25;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + "Choco Chips, ";
    }
}
