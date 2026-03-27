package edu.immune.sw.pattern.strategy.txn;

public class TransactionDetail {

    private PaymentMode paymentMode;

    private String cardNumber;
    private String expiryDate;
    private String virtualPaymentAddress;

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }
}
