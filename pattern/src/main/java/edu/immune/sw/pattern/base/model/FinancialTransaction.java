package edu.immune.sw.pattern.base.model;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Lalit Mehra
 * @since Dec 20, 2019
 *
 */
public class FinancialTransaction {

	private static AtomicInteger transactionId;

	private Customer payer;
	private Customer payee;
	private int amount;
	private int txnId;

	static {
		transactionId = new AtomicInteger(0);
	}

	public FinancialTransaction(Customer payer, Customer payee, int amount) {
		this.payer = payer;
		this.payee = payee;
		this.amount = amount;
		this.txnId = transactionId.incrementAndGet();
	}

	public Customer getPayer() {
		return payer;
	}

	public Customer getPayee() {
		return payee;
	}

	public int getAmount() {
		return amount;
	}

	public int getTxnId() {
		return txnId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FinancialTransaction [payer=");
		builder.append(payer);
		builder.append(", payee=");
		builder.append(payee);
		builder.append(", amount=");
		builder.append(amount);
		builder.append(", txnId=");
		builder.append(txnId);
		builder.append("]");
		return builder.toString();
	}

}
