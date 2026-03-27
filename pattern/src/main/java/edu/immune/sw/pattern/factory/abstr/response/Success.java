package edu.immune.sw.pattern.factory.abstr.response;

import edu.immune.sw.pattern.factory.ProcessResult;
import edu.immune.sw.pattern.factory.abstr.Response;

public class Success extends Response {

	public Success(ProcessResult result) {
		super(result);
	}

	@Override
	public void process() {
		System.out.println("process success information");
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
