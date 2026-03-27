package edu.immune.sw.pattern.factory.method;

import edu.immune.sw.pattern.factory.Message;
import edu.immune.sw.pattern.factory.ProcessResult;
import edu.immune.sw.pattern.factory.abstr.Formatter;
import edu.immune.sw.pattern.factory.abstr.impl.JsonFormatter;

public abstract class Response {
	
	protected Message message;
	protected ProcessResult result;
	
	protected Formatter formatter;
	protected String response;
	
	protected Response(ProcessResult result) {
		this.result = result;
		this.message = new Message();
		this.formatter = new JsonFormatter();
	}
	
	public void read() {
		message.extract(result);
	}

	public void process() {
		System.out.println("process data before formatting");
	}
	
	public abstract void convert();
	
	public void format() {
		System.out.println("convert response to json format");
		formatter.format(response);
	}

}
