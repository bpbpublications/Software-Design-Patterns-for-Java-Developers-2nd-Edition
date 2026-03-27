package edu.immune.sw.pattern.builder.builder;

import edu.immune.sw.pattern.builder.DeploymentAction;
import edu.immune.sw.pattern.builder.DeploymentBuilder;
import edu.immune.sw.pattern.builder.DeploymentStrategy;
import edu.immune.sw.pattern.builder.resource.MessagingQueue;
import edu.immune.sw.pattern.builder.resource.impl.RabbitMQ;

public class WebMQDeploymentBuilder extends WebDeploymentBuilder {

	private MessagingQueue queue;
	
	@Override
	public DeploymentBuilder installMQ() {
		System.out.println("Configuring RabbitMQ");
		queue = new RabbitMQ();
		return this;
	}	
	
	@Override
	public DeploymentAction build() {
		if (null == database || null == projectManager || null == server || null == queue)  
			throw new IllegalStateException();
		
		action = new DeploymentAction();
		action.setDatabase(database);
		action.setProManager(projectManager);
		action.setServer(server);
		action.setQueue(queue);
		action.setDescription(DeploymentStrategy.WEBMQ.strategy());
		return action;
	}

}
