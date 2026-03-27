package edu.immune.sw.pattern.factory.abstr.gen;

import edu.immune.sw.pattern.factory.ProcessResult;
import edu.immune.sw.pattern.factory.ResponseType;
import edu.immune.sw.pattern.factory.abstr.Response;
import edu.immune.sw.pattern.factory.abstr.ResponseDialectFactory;
import edu.immune.sw.pattern.factory.abstr.ResponseGenerator;
import edu.immune.sw.pattern.factory.abstr.dialect.FrenchDialectFactory;
import edu.immune.sw.pattern.factory.abstr.response.FrenchFailure;
import edu.immune.sw.pattern.factory.abstr.response.FrenchSuccess;
import edu.immune.sw.pattern.factory.abstr.response.FrenchTimeOut;

public class FrenchResponseGenerator extends ResponseGenerator {
	
	private ResponseDialectFactory dialect = new FrenchDialectFactory();

	public Response construct(ProcessResult result, ResponseType type) {
		Response resp = null;
		switch (type) {
		case SUCCESS:
			resp = new FrenchSuccess(result, dialect);
			break;
		case FAILURE:
			resp = new FrenchFailure(result, dialect);
			break;
		case TIMEOUT:
			resp = new FrenchTimeOut(result, dialect);
			break;
		default:
			break;
		}
		return resp;
	}

}
