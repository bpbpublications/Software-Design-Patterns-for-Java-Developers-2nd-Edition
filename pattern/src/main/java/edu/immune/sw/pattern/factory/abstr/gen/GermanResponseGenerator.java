package edu.immune.sw.pattern.factory.abstr.gen;

import edu.immune.sw.pattern.factory.ProcessResult;
import edu.immune.sw.pattern.factory.ResponseType;
import edu.immune.sw.pattern.factory.abstr.Response;
import edu.immune.sw.pattern.factory.abstr.ResponseDialectFactory;
import edu.immune.sw.pattern.factory.abstr.ResponseGenerator;
import edu.immune.sw.pattern.factory.abstr.dialect.GermanDialectFactory;
import edu.immune.sw.pattern.factory.abstr.response.GermanFailure;
import edu.immune.sw.pattern.factory.abstr.response.GermanSuccess;
import edu.immune.sw.pattern.factory.abstr.response.GermanTimeOut;

public class GermanResponseGenerator extends ResponseGenerator {

	private ResponseDialectFactory dialect = new GermanDialectFactory();

	public Response construct(ProcessResult result, ResponseType type) {
		Response resp = null;
		switch (type) {
		case SUCCESS:
			resp = new GermanSuccess(result, dialect);
			break;
		case FAILURE:
			resp = new GermanFailure(result, dialect);
			break;
		case TIMEOUT:
			resp = new GermanTimeOut(result, dialect);
			break;
		default:
			break;
		}
		return resp;
	}

	public static void main(String[] args) {
		try {
			Float f1 = new Float("3.0");
			int x = f1.intValue();
			byte b = f1.byteValue();
			double d = f1.doubleValue();
			System.out.println(x + b + d);
		} catch (NumberFormatException e) {
			System.out.println("bad number");
		}
	}

}
