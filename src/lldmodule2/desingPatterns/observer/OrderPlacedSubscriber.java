package lldmodule2.desingPatterns.observer;

public interface OrderPlacedSubscriber { // all children would be a subscriber to all events of Order place
    void orderPlaceAction(); // execute this method when order place event takes place
}
