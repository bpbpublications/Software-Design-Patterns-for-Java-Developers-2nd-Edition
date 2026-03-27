package edu.immune.sw.pattern.singleton.impl;

/**
 * Double Check Locking Singleton
 * 
 * @author Lalit Mehra
 *
 */
public class DoubleCheckSingleton {

	private static DoubleCheckSingleton instance;

	private DoubleCheckSingleton() {}

	public static DoubleCheckSingleton getInstance() {

		if (null == instance) 
			synchronized (DoubleCheckSingleton.class) {
				if (null == instance)
					instance = new DoubleCheckSingleton();
			}

		return instance;
	}

}
