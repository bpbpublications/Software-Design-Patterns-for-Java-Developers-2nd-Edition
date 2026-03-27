package edu.immune.sw.pattern.factory.method;

import edu.immune.sw.pattern.factory.ProcessResult;
import edu.immune.sw.pattern.factory.ResponseType;
import edu.immune.sw.pattern.factory.method.Response;
import edu.immune.sw.pattern.factory.method.bean.FrenchFailure;
import edu.immune.sw.pattern.factory.method.bean.FrenchSuccess;
import edu.immune.sw.pattern.factory.method.bean.FrenchTimeOut;

public class FrenchResponseGenerator extends ResponseGenerator {

	public Response construct(ProcessResult result, ResponseType type) {
		Response resp = null;
		switch (type) {
		case SUCCESS:
			resp = new FrenchSuccess(result);
			break;
		case FAILURE:
			resp = new FrenchFailure(result);
			break;
		case TIMEOUT:
			resp = new FrenchTimeOut(result);
			break;
		default:
			break;
		}
		return resp;
	}

}
