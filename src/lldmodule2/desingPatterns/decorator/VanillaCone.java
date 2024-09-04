package lldmodule2.desingPatterns.decorator;

//base addon -> can be used directly
public class VanillaCone implements IceCream{
    private IceCream iceCream;
    private int cost;

    public VanillaCone(IceCream iceCream) {
        this.iceCream = iceCream;
        this.cost = iceCream.getCost() + 10;
    }

    public VanillaCone() {
        this.cost = 10;
    }


    @Override
    public int getCost() {
        if(iceCream == null){
            return 10;
        } else {
            return iceCream.getCost() + 10;
        }
    }

    @Override
    public String getDescription() {
        if(iceCream == null){
            return "Vanilla Cone, ";
        } else {
            return iceCream.getDescription() + "Vanilla Cone, ";
        }
    }

}
