package edu.immune.sw.pattern.factory.abstr.response;

import edu.immune.sw.pattern.factory.ProcessResult;
import edu.immune.sw.pattern.factory.abstr.Response;
import edu.immune.sw.pattern.factory.abstr.ResponseDialectFactory;

public class GermanSuccess extends Response {

	private ResponseDialectFactory factory;

	public GermanSuccess(ProcessResult result, ResponseDialectFactory factory) {
		super(result);
		this.factory = factory;
	}

	@Override
	public void setup() {
		System.out.println("setup german dialect");
		formatter = factory.getFormatter();
		converter = factory.getConverter();
		reader = factory.getReader();
	}

	@Override
	public void convert() {
		System.out.println("convert response to german dialect");
		converter.convert(result.getOrder().getNotes());
	}

	@Override
	public void read() {
		this.message = reader.read(result);
	}

	@Override
	public void format() {
		System.out.println("convert response to " + formatter.whichFormat());
		response = formatter.format(result.getOrder().getNotes());
	}

}
