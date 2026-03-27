package edu.immune.sw.pattern.factory.method.bean;

import edu.immune.sw.pattern.factory.ProcessResult;
import edu.immune.sw.pattern.factory.method.Response;

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

}
