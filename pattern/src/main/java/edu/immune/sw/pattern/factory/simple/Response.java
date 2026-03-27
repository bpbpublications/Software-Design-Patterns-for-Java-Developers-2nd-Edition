package edu.immune.sw.pattern.factory.simple;

import edu.immune.sw.pattern.factory.Message;
import edu.immune.sw.pattern.factory.ProcessResult;

public abstract class Response {
	
	protected Message message;
	protected ProcessResult result;
	
	protected Response(ProcessResult result) {
		this.result = result;
		this.message = new Message();
	}
	
	public void read() {
		message.extract(result);
	}

	public void process() {
		System.out.println("process data before formatting");
	}
	
	public void format() {
		System.out.println("convert response to json format");
	}

}
