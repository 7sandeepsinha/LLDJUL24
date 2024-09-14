package MC_solidPrinciples.adapter;

public interface BankAPI {
    double checkBalance(String upiID, int pin);
    void addNewBankAccount(String bankAccountNumber,
                           String debitCardDetails,
                           int otp,
                           int pin) throws Exception;
    int makePayment(String fromUPIId,
                    String toUPIId,
                    double amount,
                    int pin);
}
