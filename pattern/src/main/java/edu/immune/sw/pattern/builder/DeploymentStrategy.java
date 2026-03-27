package edu.immune.sw.pattern.builder;

public enum DeploymentStrategy {
	
	WEB("WebServer Deployment Strategy"),
	CONSOLE("Console Deployment Strategy"),
	WEBMQ("Web MQ Deployment Strategy"),
	VANILLA("Basic Deployment Strategy");
	
	DeploymentStrategy(String strategy) {
		this.strategy = strategy;
	}
	
	private String strategy;
	
	public String strategy() {
		return strategy;
	}

}
