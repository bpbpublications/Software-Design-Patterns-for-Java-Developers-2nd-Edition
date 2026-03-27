package edu.immune.sw.pattern.command.model;

public class ShortMessage {

	private String to;
	private String content;

	public ShortMessage(String to, String content) {
		super();
		this.to = to;
		this.content = content;
	}

	public String getTo() {
		return to;
	}

	public String getContent() {
		return content;
	}

}
