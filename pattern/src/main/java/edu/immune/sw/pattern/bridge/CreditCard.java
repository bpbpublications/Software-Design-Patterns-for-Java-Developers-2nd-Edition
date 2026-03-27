package edu.immune.sw.pattern.bridge;

public class CreditCard implements TransactionMode {
    public void process(String type, double amount) {
        System.out.println(type + " of ₹" + amount + " using Credit Card.");
    }
}
