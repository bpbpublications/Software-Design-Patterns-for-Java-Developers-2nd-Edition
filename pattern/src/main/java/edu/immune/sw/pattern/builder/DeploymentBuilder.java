package edu.immune.sw.pattern.builder;

public interface DeploymentBuilder {
	
	public DeploymentAction build();
	
	public default DeploymentBuilder installServer() {
		return this;
	}

	public default DeploymentBuilder installProjectManager() {
		return this;
	}
	
	public default DeploymentBuilder installDatabase() {
		return this;
	}
	
	public default DeploymentBuilder installMQ() {
		return this;
	}

}
