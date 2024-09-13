package MC_solidPrinciples.adapter.thirdParty;

public class AxisBankAPI {

    public double getBalance(String upiId, int pin){
        return 0;
    }

    public void addNewAccount(String bankAccountNumber, String debitCard, int otp, int pin){
        // if it fails, it would throw an exception
        // if successful no return
    }

    public char transferPayment(String fromUpiId, String toUpiId, double amount, int pin){
        return 'Y';
    }

}
