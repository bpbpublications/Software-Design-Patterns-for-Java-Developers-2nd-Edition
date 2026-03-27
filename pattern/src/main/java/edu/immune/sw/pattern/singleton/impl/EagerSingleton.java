package edu.immune.sw.pattern.singleton.impl;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Eagerly initialized Singleton
 * 
 * @author Lalit Mehra
 *
 */
public class EagerSingleton {
	
	private static EagerSingleton instance = new EagerSingleton();
	private AtomicLong count;
	
	private EagerSingleton() {
		count = new AtomicLong();
	}
	
	public static EagerSingleton getInstance() {
		return instance;
	}
	
	public void incrementCount() {
		count.incrementAndGet();
	}
	
	public long getCount() {
		return count.get();
	}

}
