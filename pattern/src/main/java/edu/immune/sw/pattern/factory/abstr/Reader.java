package edu.immune.sw.pattern.factory.abstr;

import edu.immune.sw.pattern.factory.Message;
import edu.immune.sw.pattern.factory.ProcessResult;

public interface Reader {

	public Message read(ProcessResult result);
	
}
