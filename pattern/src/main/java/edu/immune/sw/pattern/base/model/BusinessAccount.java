package edu.immune.sw.pattern.base.model;

import java.util.concurrent.atomic.AtomicLong;

/**
 * A simple Business Wallet
 * 
 * @author Lalit Mehra
 * @since Dec 10, 2019
 */
public class BusinessAccount implements Printable {

	private String accountId;
	private String accountName;
	private AtomicLong balance;

	public BusinessAccount(String id, String name, long balance) {
		this.accountId = id;
		this.accountName = name;
		this.balance = new AtomicLong(balance);
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
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
		builder.append("BusinessAccount [accountId=");
		builder.append(accountId);
		builder.append(", accountName=");
		builder.append(accountName);
		builder.append(", balance=");
		builder.append(balance);
		builder.append("]");
		return builder.toString();
	}

	public void print() {
		System.out.println(this.toString());
	}

}