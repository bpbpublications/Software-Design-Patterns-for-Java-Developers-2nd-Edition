package edu.immune.sw.pattern.factory.abstr.impl;

import edu.immune.sw.pattern.factory.Message;
import edu.immune.sw.pattern.factory.ProcessResult;
import edu.immune.sw.pattern.factory.abstr.Reader;

public class DefaultReader implements Reader {

	@Override
	public Message read(ProcessResult result) {
		return new Message();
	}

}
