package edu.immune.sw.pattern.factory.simple.bean;

import edu.immune.sw.pattern.factory.ProcessResult;
import edu.immune.sw.pattern.factory.simple.Response;

public class Failure extends Response {

	public Failure(ProcessResult result) {
		super(result);
	}

	@Override
	public void process() {
		System.out.println("process failure information");
	}
}
