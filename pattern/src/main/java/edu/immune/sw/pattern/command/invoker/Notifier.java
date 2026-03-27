package edu.immune.sw.pattern.command.invoker;

import edu.immune.sw.pattern.command.Command;

public class Notifier {
	
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}

	public void invoke() {
		command.execute();
	}
}
