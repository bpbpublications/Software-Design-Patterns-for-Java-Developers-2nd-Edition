package edu.immune.sw.pattern.command.receiver;

import edu.immune.sw.pattern.command.model.ShortMessage;

public class SmsNotification implements Notification {

	private ShortMessage message;
	
	public SmsNotification(ShortMessage message) {
		this.message = message;
	}
	
	@Override
	public void send() {
		System.out.println("Preparing Message");
		System.out.println("Connecting to SMS Server");
		System.out.println("Sending Message to " + message.getTo());
	}

	@Override
	public void scheduledSend() {
		System.out.println("Preparing Message");
		System.out.println("Connecting to SMS Server");
		System.out.println("Sending Message to " + message.getTo());
		System.out.println("SMS Scheduled");
	}
	
	public ShortMessage getMessage() {
		return message;
	}

}
