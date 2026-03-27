package edu.immune.sw.pattern.factory;

public enum ResponseType {

	SUCCESS("Success!"), FAILURE("Failure!"), TIMEOUT("Time Out!"), IN_PROGRESS("In Progress!");

	ResponseType(String msg) {
		this.msg = msg;
	}

	String msg;

	String getMsg() {
		return msg;
	}

}