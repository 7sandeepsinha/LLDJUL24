package lldmodule2.desingPatterns.strategy;

public class CarPathCalculator implements PathCalculator{

    private static CarPathCalculator instance = null;

    private CarPathCalculator(){
    }

    public static CarPathCalculator getInstance(){
        if(instance == null) {
            synchronized (CarPathCalculator.class) {
                if (instance == null) {
                    instance = new CarPathCalculator();
                }
            }
        }
        return instance;
    }

    @Override
    public void findPath(String source, String destination) {
        System.out.println("Path calculated for Car");
    }
}
