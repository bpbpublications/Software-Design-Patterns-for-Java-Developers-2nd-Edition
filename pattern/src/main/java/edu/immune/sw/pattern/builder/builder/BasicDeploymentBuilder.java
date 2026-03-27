package edu.immune.sw.pattern.builder.builder;

import edu.immune.sw.pattern.builder.DeploymentAction;
import edu.immune.sw.pattern.builder.DeploymentBuilder;

public class BasicDeploymentBuilder implements DeploymentBuilder {

	private DeploymentAction action;

	public BasicDeploymentBuilder() {
		action = new DeploymentAction();
	}

	@Override
	public DeploymentAction build() {
		action.setDescription("Basic Deployment Scheme");
		return action;
	}
}
