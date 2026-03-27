package edu.immune.sw.pattern.factory.abstr.gen;

import edu.immune.sw.pattern.factory.ProcessResult;
import edu.immune.sw.pattern.factory.ResponseType;
import edu.immune.sw.pattern.factory.abstr.Response;
import edu.immune.sw.pattern.factory.abstr.ResponseGenerator;
import edu.immune.sw.pattern.factory.abstr.response.Failure;
import edu.immune.sw.pattern.factory.abstr.response.Success;
import edu.immune.sw.pattern.factory.abstr.response.TimeOut;

public class DefaultResponseGenerator extends ResponseGenerator {

	public Response construct(ProcessResult result, ResponseType type) {
		Response resp = null;
		switch (type) {
		case SUCCESS:
			resp = new Success(result);
			break;
		case FAILURE:
			resp = new Failure(result);
			break;
		case TIMEOUT:
			resp = new TimeOut(result);
			break;
		default:
			break;
		}
		return resp;
	}

}
