package lldmodule2.desingPatterns.adapter.thirdParty;

public class AxisBankAPI {

    public double getBalance(String upiId, int pin){
        return 0;
    }

    public void addNewAccount(String bankAccountNumber, String debitCard, int otp, int pin){

    }

    public char transferPayment(String fromUpiId, String toUpiId, double amount, int pin){
        return 'Y';
    }

}
