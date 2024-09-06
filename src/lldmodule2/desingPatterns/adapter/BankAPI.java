package lldmodule2.desingPatterns.adapter;

//methods that we need
public interface BankAPI {
    double checkBalance(String upiId, int pin);
    void addBankAccount(BankDetails details, int pin, int otp) throws Exception;
    int transfer(String fromUpiId, String toUpiId, int pin, double amount);
}
