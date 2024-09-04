package lldmodule2.desingPatterns.decorator;

//base addon -> can be used directly
public class ChocolateCone implements IceCream{
    private IceCream iceCream;

    // normal addon
    public ChocolateCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    //base addon
    public ChocolateCone(){
    }

    @Override
    public int getCost() {
        if(iceCream == null){
            return 20;
        } else {
            return iceCream.getCost() + 20;
        }
    }

    @Override
    public String getDescription() {
        if(iceCream == null){
            return "Chocolate Cone, ";
        } else {
            return iceCream.getDescription() + "Chocolate Cone, ";
        }
    }
}
