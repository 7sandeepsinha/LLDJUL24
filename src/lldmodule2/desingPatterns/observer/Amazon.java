package lldmodule2.desingPatterns.observer;

import java.util.ArrayList;
import java.util.List;

//publisher class -> event happens here ->
public class Amazon {
    private List<OrderPlacedSubscriber> orderPlacedSubscribers;
    private static Amazon instance = null;

    private Amazon() {
        this.orderPlacedSubscribers = new ArrayList<>();
    }

    public static Amazon getInstance(){
        if(instance == null){
            synchronized (Amazon.class){
                if(instance == null){
                    instance = new Amazon();
                }
            }
        }
        return instance;
    }

    public void addSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscribers.add(orderPlacedSubscriber);
    }

    public void removeSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscribers.remove(orderPlacedSubscriber);
    }

    public void placeOrder(){
        //code
        for(OrderPlacedSubscriber subscriber : orderPlacedSubscribers){
            subscriber.orderPlaceAction();
        }
    }

}
