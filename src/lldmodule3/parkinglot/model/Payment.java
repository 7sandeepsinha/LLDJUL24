package lldmodule3.parkinglot.model;

import lldmodule3.parkinglot.model.constant.PaymentStatus;
import lldmodule3.parkinglot.model.constant.PaymentType;

public class Payment {
    private int id;
    private double amount;
    private String referenceNumber; // transaction number -> generated from payment source
    private PaymentStatus paymentStatus;
    private PaymentType paymentType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
}
