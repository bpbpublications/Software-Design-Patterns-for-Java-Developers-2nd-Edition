package edu.immune.sw.pattern.command;

public interface Command {
	
	public void execute();
	
	public default void undo() {
		// do nothing
	}

}
