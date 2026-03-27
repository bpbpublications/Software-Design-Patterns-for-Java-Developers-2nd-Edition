package edu.immune.sw.pattern.command;

import edu.immune.sw.pattern.command.receiver.Notification;

public class QuickNotify implements Command {

	private Notification nService;
	
	public QuickNotify(Notification nService) {
		this.nService = nService;
	}
	
	@Override
	public void execute() {
		nService.send();
	}
	
}
