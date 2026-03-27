package edu.immune.sw.pattern.bridge;

public class Payment extends Transaction {
    public Payment(TransactionMode mode) {
        super(mode);
    }

    @Override
    public void execute(double amount) {
        // pre tasks
        mode.process("Payment", amount);
        // post tasks
    }
}