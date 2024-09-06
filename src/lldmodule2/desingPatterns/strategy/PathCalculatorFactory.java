package lldmodule2.desingPatterns.strategy;

public class PathCalculatorFactory {
    private static CarPathCalculator carPathCalculator = CarPathCalculator.getInstance();

    public static PathCalculator getPathCalculator(String mode){
        if(mode.equals("CAR")){
            return carPathCalculator;
        }
        return null;
    }
}
