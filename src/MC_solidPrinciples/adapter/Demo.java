package MC_solidPrinciples.adapter;

public class Demo {
    public static void main(String[] args) {
        AxisBankAPIAdapter axisBankAPIAdapter = new AxisBankAPIAdapter();
        YesBankAPIAdapter yesBankAPIAdapter = new YesBankAPIAdapter();
        PhonePe phonePe = new PhonePe(axisBankAPIAdapter);
        phonePe = new PhonePe(yesBankAPIAdapter);
        phonePe = new PhonePe(new ICICIBankAPIAdapter());
    }
}
