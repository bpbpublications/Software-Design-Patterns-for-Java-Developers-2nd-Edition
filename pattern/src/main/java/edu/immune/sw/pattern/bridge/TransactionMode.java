package edu.immune.sw.pattern.bridge;

public interface TransactionMode {
    void process(String type, double amount);
}