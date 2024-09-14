package lldmodule2.desingPatterns.observer;

public class LogisticsService implements OrderPlacedSubscriber{

    public LogisticsService() {
        Amazon.getInstance().addSubscriber(this);
    }

    @Override
    public void orderPlaceAction() {
        System.out.println("Generating tracking link");
    }
}
