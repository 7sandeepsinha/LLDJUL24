package lldmodule2.desingPatterns.adapter;

import lldmodule2.desingPatterns.adapter.thirdParty.YesBankAPI;

public class YesBankAPIAdapter implements BankAPI{

    private YesBankAPI yesBankAPI;

    public YesBankAPIAdapter() {
        this.yesBankAPI = new YesBankAPI();
    }

    @Override
    public double checkBalance(String upiId, int pin) {
        String balance = yesBankAPI.checkBalance(upiId, String.valueOf(pin));
        return Double.parseDouble(balance);
    }

    @Override
    public void addBankAccount(BankDetails details, int pin, int otp) throws Exception {
        int addAccount = yesBankAPI.addBankAccount(
                                String.valueOf(pin),
                                otp,
                                details.getBankAccountId());

        if(addAccount == 2 || addAccount == 3){
            throw new Exception("Bank account addition failed");
        }
    }

    @Override
    public int transfer(String fromUpiId, String toUpiId, int pin, double amount) {
        int result = yesBankAPI.makeTransfer(amount, pin, fromUpiId, toUpiId);
        return result;
    }
}
