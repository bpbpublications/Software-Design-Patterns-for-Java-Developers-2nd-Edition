package edu.immune.sw.pattern.bridge;

public abstract class Transaction {
    protected TransactionMode mode;

    public Transaction(TransactionMode mode) {
        this.mode = mode;
    }

    public abstract void execute(double amount);
}
