package MC_solidPrinciples.adapter.thirdParty;

public class YesBankAPI {

    public String checkBalance(String upiDetails, String pin){
        return "12345";
    }

    public int addBankAccount(String pin, int otp, String bankAccountNumber){
        return 1;
        // 1 - means successful
        // 2 - failure
        // 3 - in progress
    }

    public int makeTransfer(double amount, int pin, String fromUpiId, String toUpiId){
        return 0;
    }
}

