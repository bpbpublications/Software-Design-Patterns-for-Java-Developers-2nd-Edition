package edu.immune.sw.pattern.strategy.txn;

import edu.immune.sw.pattern.base.model.BusinessAccount;
import edu.immune.sw.pattern.base.model.Customer;

/**
 * Processes payment between two entities
 * 
 * @author Lalit Mehra
 * @since Dec 10, 2019
 *
 */
public class Payment implements Transactionable {

	private TransactionProcessor transactionProcessor;
	
	/**
	 * make a payment to the business account
	 */
	public synchronized void transact(TransactionDetail txnDetail, BusinessAccount businessAccount, Customer customer, long amount) {
		transactionProcessor.processTxn(txnDetail, amount);
		customer.debit(amount);
		businessAccount.credit(amount);
	}

}
