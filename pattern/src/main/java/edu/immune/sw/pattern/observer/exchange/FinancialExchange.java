package edu.immune.sw.pattern.observer.exchange;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import edu.immune.sw.pattern.base.model.Customer;
import edu.immune.sw.pattern.base.model.FinancialTransaction;

/**
 * Financial Exchange processes financial transactions among two {@code Customer} where <br>
 * first one is a payer and other is a payee. Few objects of type Customers are initialised to process <br>
 * these transactions. The transactions are done randomly among the customers 
 * 
 * @author Lalit Mehra
 * @since Dec 20, 2019
 *
 */
public class FinancialExchange {

	/* Random number generator */
	private Random randomGenerator = new Random();

	/* Monitor Instance to notify about transfer */
	private FinancialExchangeMonitor monitor;

	/* Map of customers used for transaction processing */
	private Map<Integer, Customer> customers;

	/* Initialise customer with default values */
	private void initializeCustomers() {
		this.customers = new HashMap<Integer, Customer>();

		int count = 0;
		while (count < 10) {
			String name = "Customer_" + count;
			String id = "custId_" + count;
			Customer customer = new Customer(name, id);
			customers.put(count, customer);
			count++;
		}
	}

	public FinancialExchange(FinancialExchangeMonitor monitor) {
		this.monitor = monitor;
		initializeCustomers();
	}

	/* Process money transfer */
	private synchronized void processTxn() {
		Customer payer = customers.get(randomGenerator.nextInt(9));
		Customer payee = customers.get(randomGenerator.nextInt(9));

		int amount = randomGenerator.nextInt(20);
		 payer.debit(amount);
		 payee.credit(amount);
		
		monitor.notifyObservers(new FinancialTransaction(payer, payee, amount));

	}

	/* Start the Exchange */
	public void start(int transactions) {

		List<Thread> txnProcessors = Stream
				.generate(() -> new Thread(new Runnable() {
					public void run() {
						processTxn();
					}}))
				.limit(transactions)
				.collect(Collectors.toList());
		
		txnProcessors.forEach(Thread::start);
	}

}
