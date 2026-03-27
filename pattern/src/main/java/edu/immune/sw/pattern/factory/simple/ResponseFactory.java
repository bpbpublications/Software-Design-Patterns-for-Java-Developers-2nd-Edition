package edu.immune.sw.pattern.factory.simple;

import edu.immune.sw.pattern.factory.ProcessResult;
import edu.immune.sw.pattern.factory.ResponseType;
import edu.immune.sw.pattern.factory.simple.bean.Failure;
import edu.immune.sw.pattern.factory.simple.bean.Success;
import edu.immune.sw.pattern.factory.simple.bean.TimeOut;

public class ResponseFactory {

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
