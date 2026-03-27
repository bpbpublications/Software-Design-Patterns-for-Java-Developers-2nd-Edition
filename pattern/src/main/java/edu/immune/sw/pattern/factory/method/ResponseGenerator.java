package edu.immune.sw.pattern.factory.method;

import edu.immune.sw.pattern.factory.ProcessResult;
import edu.immune.sw.pattern.factory.ResponseType;

public abstract class ResponseGenerator {

	public Response prepareResponse(ProcessResult result, ResponseType type) {
		Response resp = construct(result, type);

		resp.read();
		resp.process();
		resp.convert();
		resp.format();

		return resp;
	}
	
	protected abstract Response construct(ProcessResult result, ResponseType type);

}
