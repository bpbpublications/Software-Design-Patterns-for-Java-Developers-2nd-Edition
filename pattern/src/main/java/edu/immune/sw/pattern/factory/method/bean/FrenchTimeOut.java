package edu.immune.sw.pattern.factory.method.bean;

import edu.immune.sw.pattern.factory.ProcessResult;
import edu.immune.sw.pattern.factory.method.Response;

public class FrenchTimeOut extends Response {

	public FrenchTimeOut(ProcessResult result) {
		super(result);
	}

	@Override
	public void convert() {
		System.out.println("convert response to french dialect");
	}

}
