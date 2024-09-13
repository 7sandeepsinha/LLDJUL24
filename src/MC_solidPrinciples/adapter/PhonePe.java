package MC_solidPrinciples.adapter;

public class PhonePe {
    BankAPI bankAPI;

    public PhonePe(BankAPI bankAPI) {
        this.bankAPI = bankAPI;
    }

    public void checkBalance(){
        double amount = bankAPI.checkBalance("UPI Id", 1234);
        System.out.println("Your balance : " + amount);
    }

    //..... lot of code below
}

