package edu.immune.sw.pattern.factory.simple;

import edu.immune.sw.pattern.factory.ProcessResult;
import edu.immune.sw.pattern.factory.ResponseType;

public class ResponseGenerator {

	private ResponseFactory factory = new ResponseFactory();

	public Response prepareResponse(ProcessResult result, ResponseType type) {
		Response resp = factory.construct(result, type);

		resp.read();
		resp.process();
		resp.format();

		return resp;
	}

}
