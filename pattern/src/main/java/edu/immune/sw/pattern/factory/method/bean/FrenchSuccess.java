package edu.immune.sw.pattern.factory.method.bean;

import edu.immune.sw.pattern.factory.ProcessResult;
import edu.immune.sw.pattern.factory.abstr.Converter;
import edu.immune.sw.pattern.factory.abstr.impl.FrenchDialectConverter;
import edu.immune.sw.pattern.factory.method.Response;

public class FrenchSuccess extends Response {
	
	Converter converter = new FrenchDialectConverter();
	
	public FrenchSuccess(ProcessResult result) {
		super(result);
	}

	@Override
	public void process() {
		System.out.println("process success information");
	}

	@Override
	public void convert() {
		System.out.println("convert response to french dialect");
		response = converter.convert(result.getOrder().getNotes());
	}
	
}
