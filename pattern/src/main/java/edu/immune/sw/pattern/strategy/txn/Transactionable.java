package edu.immune.sw.pattern.strategy.txn;

import edu.immune.sw.pattern.base.model.BusinessAccount;
import edu.immune.sw.pattern.base.model.Customer;

/**
 * Provides mandatory methods required to process a transaction<br>
 * Ensures that the implementing class can take part in a transaction process<br>
 * Transaction here means movement of money and should not be confused with making operations atomic and such
 * 
 * @author Lalit Mehra
 * @since Dec 10, 2019
 */
public interface Transactionable {
	
	public void transact(TransactionDetail txnDetail, BusinessAccount businessAccount, Customer customer, long amount);

}