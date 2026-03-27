package edu.immune.sw.pattern.factory.abstr.response;

import edu.immune.sw.pattern.factory.ProcessResult;
import edu.immune.sw.pattern.factory.abstr.Response;

public class TimeOut extends Response {

	public TimeOut(ProcessResult result) {
		super(result);
	}

	@Override
	public void convert() {
		System.out.println("conversion not required");
	}

	@Override
	public void setup() {
		System.out.println("setup not required");
	}

}
