package MC_solidPrinciples.adapter;

import lldmodule2.desingPatterns.adapter.thirdParty.AxisBankAPI;

public class AxisBankAPIAdapter implements BankAPI{
    private AxisBankAPI axisBankAPI;

    public AxisBankAPIAdapter() {
        this.axisBankAPI = new AxisBankAPI();
    }

    @Override
    public double checkBalance(String upiID, int pin) {
        return axisBankAPI.getBalance(upiID, pin);
    }

    @Override
    public void addNewBankAccount(String bankAccountNumber, String debitCardDetails, int otp, int pin) throws Exception {
        axisBankAPI.addNewAccount(bankAccountNumber, debitCardDetails, otp, pin);
    }

    @Override
    public int makePayment(String fromUPIId, String toUPIId, double amount, int pin) {
        char statusCode = axisBankAPI.transferPayment(fromUPIId, toUPIId, amount, pin);
        if(statusCode == 'Y'){
            return 1;
        } else if(statusCode == 'I'){
            return 3;
        } else { // status == 'F'
            return 2;
        }
    }
}
