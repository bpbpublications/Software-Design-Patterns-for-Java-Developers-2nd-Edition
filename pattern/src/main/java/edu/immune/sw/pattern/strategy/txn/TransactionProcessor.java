package edu.immune.sw.pattern.strategy.txn;

public class TransactionProcessor {

    public void processTxn(TransactionDetail txnDetail, long amount) {
        switch (txnDetail.getPaymentMode()) {
            case CREDIT_CARD -> System.out.printf("Using CC for Payment Processing for Amount " + amount);
            case DEBIT_CARD -> System.out.printf("Using DC for Payment Processing for Amount " + amount);
            case UPI -> System.out.printf("Using UPI for Payment Processing for Amount " + amount);
        }
    }

}
