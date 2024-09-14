package lldmodule2.desingPatterns.observer;

public class CustomerNotificationService implements OrderPlacedSubscriber{

    public CustomerNotificationService(){
        ////code
        Amazon.getInstance().addSubscriber(this);
    }

    @Override
    public void orderPlaceAction() {
        System.out.println("Customer is being notified for order place event");
    }
}
