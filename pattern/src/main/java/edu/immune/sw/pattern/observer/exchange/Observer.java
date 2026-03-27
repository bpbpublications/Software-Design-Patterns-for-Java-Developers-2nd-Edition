package edu.immune.sw.pattern.observer.exchange;

import edu.immune.sw.pattern.base.model.FinancialTransaction;

/**
 * An {@code Observer} is an entity that wraps other entities and helps with observing an {@code Observable} <br>
 * The implementations must override the update method to receive an update from the subject under observation
 * 
 * @author Lalit Mehra
 * @since Dec 20, 2019
 * @see Observable
 *
 */
public interface Observer {
	
	/**
	 * Receive updates from the {@code Observable}
	 * @param txn
	 */
	public void update(FinancialTransaction txn);

}
