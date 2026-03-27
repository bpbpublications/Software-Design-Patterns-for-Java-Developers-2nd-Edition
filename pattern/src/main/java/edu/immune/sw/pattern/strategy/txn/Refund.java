package edu.immune.sw.pattern.strategy.txn;

import edu.immune.sw.pattern.base.model.BusinessAccount;
import edu.immune.sw.pattern.base.model.Customer;

/**
 * Processes refund between two entities
 * 
 * @author Lalit Mehra
 * @since Dec 10, 2019
 */
public class Refund implements Transactionable {

	private TransactionProcessor txnProcessor;

	/**
	 * make a refund to the customer
	 */
	public synchronized void transact(TransactionDetail txnDetail, BusinessAccount businessAccount, Customer customer, long amount) {
		txnProcessor.processTxn(txnDetail, amount);
		businessAccount.debit(amount);
		customer.credit(amount);
	}

}
