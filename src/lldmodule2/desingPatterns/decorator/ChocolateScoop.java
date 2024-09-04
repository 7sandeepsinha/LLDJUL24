package lldmodule2.desingPatterns.decorator;

public class ChocolateScoop implements IceCream{
    private IceCream iceCream;
    private int cost;

    public ChocolateScoop(IceCream iceCream) {
        this.iceCream = iceCream;
        this.cost = iceCream.getCost() + 55;
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 55;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + "Chocolate Scoop, ";
    }
}
