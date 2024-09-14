package lldmodule2.desingPatterns.observer;

public class Client {
    public static void main(String[] args) {
        Amazon a = Amazon.getInstance();

        CustomerNotificationService notificationService = new CustomerNotificationService();
        InvoiceGeneratorService generatorService = new InvoiceGeneratorService();
        LogisticsService logisticsService = new LogisticsService();

        a.placeOrder();
    }
}
