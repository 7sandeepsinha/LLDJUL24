package lldmodule2.desingPatterns.adapter;

public class PhonePe {
    private BankAPI bankAPI;

    public PhonePe(BankAPI bankAPI) {
        this.bankAPI = bankAPI;
    }

    // bankAPI will be used down the line
    // no code change will be needed here if you want to add new bank API adapters
}
