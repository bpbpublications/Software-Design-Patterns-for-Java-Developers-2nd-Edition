package edu.immune.sw.pattern.observer.exchange;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import edu.immune.sw.pattern.base.model.FinancialTransaction;

/**
 * FinancialExchangeMonitor is an {@code Observable} entity that updates its {@code Observer} 
 * 
 * @author Lalit Mehra
 * @since Dec 20, 2019
 *
 */
public class FinancialExchangeMonitor implements Observable {
	
	private List<Observer> observers;
		
	public FinancialExchangeMonitor() {
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void deregisterObserver(Observer observer) {
		Iterator<Observer> iterator = observers.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().equals(observer)) {
				iterator.remove();
			}
		}
		
	}

	@Override
	public void notifyObservers(FinancialTransaction txn) {
		observers.forEach((o) -> o.update(txn));
	}
	
}
