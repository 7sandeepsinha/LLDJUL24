package lldmodule2.desingPatterns.strategy;

public class GoogleMaps {

    public void pathCalculator(String source, String destination, String mode){
        PathCalculator pathCalculator = PathCalculatorFactory.getPathCalculator(mode);
        pathCalculator.findPath(source, destination);
    }
}
