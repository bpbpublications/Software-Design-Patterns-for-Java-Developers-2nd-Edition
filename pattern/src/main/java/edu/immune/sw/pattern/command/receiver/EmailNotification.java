package edu.immune.sw.pattern.command.receiver;

import edu.immune.sw.pattern.command.model.Email;

public class EmailNotification implements Notification {

	private Email email;
	
	public EmailNotification(Email email) {
		this.email = email;
	}
	
	@Override
	public void send() {
		System.out.println("Preparing Email");
		System.out.println("Connecting to Email Server");
		System.out.println("Sending Email with subject " + email.getSubject());
	}

	@Override
	public void scheduledSend() {
		System.out.println("Preparing Email");
		System.out.println("Connecting to Email Server");
		System.out.println("Scheduling Email with subject " + email.getSubject() + " to " + email.getTo());
		System.out.println("Email Scheduled");
	}
	
	public Email getEmail() {
		return email;
	}

}
