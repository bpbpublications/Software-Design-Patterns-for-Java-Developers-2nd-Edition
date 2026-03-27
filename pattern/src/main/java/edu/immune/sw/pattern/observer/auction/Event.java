package edu.immune.sw.pattern.observer.auction;

/**
 * @author Lalit Mehra
 *
 */
public interface Event {
	
	public void start();
	
	public default void end() {};
	
	public void next();

}
