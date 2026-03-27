package edu.immune.sw.pattern.factory.method.bean;

import edu.immune.sw.pattern.factory.ProcessResult;
import edu.immune.sw.pattern.factory.method.Response;

public class TimeOut extends Response {

	public TimeOut(ProcessResult result) {
		super(result);
	}

	@Override
	public void convert() {
		System.out.println("conversion not required");
	}

}
