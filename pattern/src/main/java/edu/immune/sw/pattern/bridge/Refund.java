package edu.immune.sw.pattern.bridge;

public class Refund extends Transaction {
    public Refund(TransactionMode mode) {
        super(mode);
    }

    @Override
    public void execute(double amount) {
        // pre tasks
        mode.process("Refund", amount);
        // post tasks
    }
}