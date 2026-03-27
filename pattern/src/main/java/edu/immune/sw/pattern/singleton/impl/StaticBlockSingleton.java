package edu.immune.sw.pattern.singleton.impl;

/**
 * Double Check Locking Singleton
 * 
 * @author Lalit Mehra
 *
 */
public class StaticBlockSingleton {

	private static StaticBlockSingleton instance;
	
	private StaticBlockSingleton() {
		throw new RuntimeException();
	}
	
	static {
		try {
			instance = new StaticBlockSingleton();
		} catch(Exception e) {
			instance = null;
		}
	}
	
	public static StaticBlockSingleton getInstance() {
		return instance;
	}
	
}
