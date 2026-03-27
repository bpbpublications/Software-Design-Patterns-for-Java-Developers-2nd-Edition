package edu.immune.sw.pattern.base.model;

import java.util.concurrent.atomic.AtomicLong;

/**
 * A simple Customer Wallet
 * 
 * @author Lalit Mehra
 * @since Dec 10, 2019
 */
public class Customer implements Printable {
	
	private String name;
	private String customerId; 
	private AtomicLong balance;
	
	public Customer(String name, String customerId) {
		this.name = name;
		this.customerId = customerId;
		this.balance = new AtomicLong(100);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
	public long getBalance() {
		return balance.get();
	}
	
	public void setBalance(long balance) {
		this.balance.set(balance);
	}
	
	public long credit(long amount) {
		return this.balance.addAndGet(amount);
	}
	
	public long debit(long amount) {
		return this.balance.addAndGet(-amount);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [name=");
		builder.append(name);
		builder.append(", customerId=");
		builder.append(customerId);
		builder.append(", balance=");
		builder.append(balance);
		builder.append("]");
		return builder.toString();
	}

	public void print() {
		System.out.println(this.toString());
	}
	
}