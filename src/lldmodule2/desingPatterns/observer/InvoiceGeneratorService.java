package lldmodule2.desingPatterns.observer;

public class InvoiceGeneratorService implements OrderPlacedSubscriber{

    public InvoiceGeneratorService() {
        Amazon.getInstance().addSubscriber(this);
    }

    @Override
    public void orderPlaceAction() {
        System.out.println("Invoice is being generated");
    }
}
