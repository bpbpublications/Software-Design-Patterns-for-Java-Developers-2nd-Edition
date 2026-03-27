package edu.immune.sw.pattern.bridge;

public class UPI implements TransactionMode {
    public void process(String type, double amount) {
        System.out.println(type + " of ₹" + amount + " via UPI.");
    }
}