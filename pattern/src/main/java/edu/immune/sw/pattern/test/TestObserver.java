package edu.immune.sw.pattern.test;

import edu.immune.sw.pattern.observer.exchange.*;

/**
 * Functional Test to verify Observer Design Patter functionality
 * 
 * @author Lalit Mehra
 * @since Dec 10, 2019
 * @see Customer
 * @see Banker
 * @see FinancialExchange
 * @see FinancialExchangeMonitor
 *
 */
public class TestObserver {

	public static void main(String[] args) {
		
		/* Initialise Observers */
		Observer customerDisplay = new Customer();
		Observer accountantDisplay = new Banker();
		
		/* Initialise FinancialExchangeMonitor and register observers with it */
		FinancialExchangeMonitor monitor = new FinancialExchangeMonitor();
		monitor.registerObserver(customerDisplay);
		monitor.registerObserver(accountantDisplay);
		
		/* Initialise FinancialExchange */
		FinancialExchange exchange = new FinancialExchange(monitor);
		exchange.start(5);
		
	}

}
