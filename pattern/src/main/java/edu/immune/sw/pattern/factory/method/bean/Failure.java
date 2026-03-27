package edu.immune.sw.pattern.factory.method.bean;

import edu.immune.sw.pattern.factory.ProcessResult;
import edu.immune.sw.pattern.factory.method.Response;

public class Failure extends Response {

	public Failure(ProcessResult result) {
		super(result);
	}

	@Override
	public void process() {
		System.out.println("process failure information");
	}

	@Override
	public void convert() {
		System.out.println("conversion not required");
	}
}
