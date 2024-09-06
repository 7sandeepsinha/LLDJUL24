package lldmodule2.desingPatterns.adapter;

public class AxisBankAPIAdapter implements BankAPI{
    @Override
    public double checkBalance(String upiId, int pin) {
        return 0;
    }

    @Override
    public void addBankAccount(BankDetails details, int pin, int otp) {

    }

    @Override
    public int transfer(String fromUpiId, String toUpiId, int pin, double amount) {
        return 0;
    }
}
