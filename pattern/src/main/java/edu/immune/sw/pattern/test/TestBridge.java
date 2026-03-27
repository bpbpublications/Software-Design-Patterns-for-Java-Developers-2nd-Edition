package edu.immune.sw.pattern.test;

import edu.immune.sw.pattern.bridge.*;

public class TestBridge {
    public static void main(String[] args) {
        TransactionMode creditCard = new CreditCard();
        TransactionMode upi = new UPI();

        Transaction t1 = new Payment(creditCard);
        t1.execute(2500); // Output: Payment of ₹2500 using Credit Card.

        Transaction t2 = new Refund(upi);
        t2.execute(700);  // Output: Refund of ₹700 via Payment API.
    }
}
