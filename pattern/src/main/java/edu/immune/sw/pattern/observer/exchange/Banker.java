package edu.immune.sw.pattern.observer.exchange;

import edu.immune.sw.pattern.base.model.FinancialTransaction;

/**
 * Observer of Financial Exchange. Displays accountant relevant information.<br>
 * 
 * @author Lalit Mehra
 * @since Dec 21, 2019
 */
public class Banker implements Observer {

	@Override
	public void update(FinancialTransaction txn) {
		System.out.printf("Banker   | Payer: %s, Payee: %s, Amount: %d \n", txn.getPayer().getName(), txn.getPayee().getName(), txn.getAmount());
	}

}
