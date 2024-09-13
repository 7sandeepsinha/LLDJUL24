package MC_solidPrinciples.adapter;

import lldmodule2.desingPatterns.adapter.thirdParty.YesBankAPI;

public class YesBankAPIAdapter implements BankAPI{

    private YesBankAPI yesBankAPI;

    public YesBankAPIAdapter() {
        this.yesBankAPI = new YesBankAPI();
    }

    @Override
    public double checkBalance(String upiID, int pin) {
        String balance = yesBankAPI.checkBalance(upiID, String.valueOf(pin));
        return Double.parseDouble(balance);
    }

    @Override
    public void addNewBankAccount(String bankAccountNumber, String debitCardDetails, int otp, int pin) throws Exception {
        int status = yesBankAPI.addBankAccount(String.valueOf(pin), otp, bankAccountNumber);
        if(status == 2){
            throw new Exception("Adding new account failed");
        }
    }

    @Override
    public int makePayment(String fromUPIId, String toUPIId, double amount, int pin) {
        return yesBankAPI.makeTransfer(amount, pin, fromUPIId, toUPIId);
    }
}
