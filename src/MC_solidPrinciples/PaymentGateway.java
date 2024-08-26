package MC_solidPrinciples;

public interface PaymentGateway {
    int payment(String card, String expiry, int cvv, int otp, int amount);
}
