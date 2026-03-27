package edu.immune.sw.pattern.factory.abstr.impl;

import edu.immune.sw.pattern.factory.abstr.Formatter;

public class JsonFormatter implements Formatter {

	@Override
	public String format(String message) {
		return "";
	}

	@Override
	public String whichFormat() {
		return "JSON";
	}

}
