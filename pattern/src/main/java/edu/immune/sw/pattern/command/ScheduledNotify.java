package edu.immune.sw.pattern.command;

import edu.immune.sw.pattern.command.receiver.Notification;

public class ScheduledNotify implements Command {

	private Notification nService;
	
	public ScheduledNotify(Notification nService) {
		this.nService = nService;
	}
	
	@Override
	public void execute() {
		nService.scheduledSend();
	}

}
