package edu.immune.sw.pattern.factory.method.bean;

import edu.immune.sw.pattern.factory.ProcessResult;
import edu.immune.sw.pattern.factory.method.Response;

public class FrenchFailure extends Response {

	public FrenchFailure(ProcessResult result) {
		super(result);
	}

	@Override
	public void process() {
		System.out.println("process failure information");
	}
	
	@Override
	public void convert() {
		System.out.println("convert response to french dialect");
	}

}
