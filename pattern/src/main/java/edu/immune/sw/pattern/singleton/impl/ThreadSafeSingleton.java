package edu.immune.sw.pattern.singleton.impl;

/**
 *  Thread Safe Singleton
 * 
 * @author Lalit Mehra
 *
 */
public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton() {
	}

	public static synchronized ThreadSafeSingleton getInstance() {

		if (null == instance) {
			instance = new ThreadSafeSingleton();
		}

		return instance;
	}

}
