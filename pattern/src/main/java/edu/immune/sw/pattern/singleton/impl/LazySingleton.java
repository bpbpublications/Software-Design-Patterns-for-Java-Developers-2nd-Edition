package edu.immune.sw.pattern.singleton.impl;

/**
 * Lazily initialized singleton 
 * 
 * @author Lalit Mehra
 *
 */
public class LazySingleton {

	private static LazySingleton instance;
	
	private LazySingleton() {}
	
	public static LazySingleton getInstance() {
		
		if(null == instance) {
			instance = new LazySingleton();
		}
		
		return instance;
		
	}
	
	public void execute() {
		// execute operation
	}
	
}
