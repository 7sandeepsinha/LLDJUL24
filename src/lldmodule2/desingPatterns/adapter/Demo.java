package lldmodule2.desingPatterns.adapter;

public class Demo {
    public static void main(String[] args) {
        PhonePe phonePe = new PhonePe(new YesBankAPIAdapter());
        phonePe = new PhonePe(new AxisBankAPIAdapter());
    }
}

// interface - 5 to 6 parameters
// bank = 3,4,5
// bank => 6 parameters || 6th value is available