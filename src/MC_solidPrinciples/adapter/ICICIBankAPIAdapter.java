package MC_solidPrinciples.adapter;

public class ICICIBankAPIAdapter implements BankAPI{
    @Override
    public double checkBalance(String upiID, int pin) {
        return 0;
    }

    @Override
    public void addNewBankAccount(String bankAccountNumber, String debitCardDetails, int otp, int pin) throws Exception {

    }

    @Override
    public int makePayment(String fromUPIId, String toUPIId, double amount, int pin) {
        return 0;
    }
}
