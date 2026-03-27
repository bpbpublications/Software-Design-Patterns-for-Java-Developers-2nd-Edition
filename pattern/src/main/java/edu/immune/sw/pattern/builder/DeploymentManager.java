package edu.immune.sw.pattern.builder;

import edu.immune.sw.pattern.builder.builder.BasicDeploymentBuilder;
import edu.immune.sw.pattern.builder.builder.ConsoleDeploymentBuilder;
import edu.immune.sw.pattern.builder.builder.WebDeploymentBuilder;
import edu.immune.sw.pattern.builder.builder.WebMQDeploymentBuilder;

public class DeploymentManager {

	public static void deploy(DeploymentStrategy scheme) {
		
		DeploymentAction action = null;
		
		switch (scheme) {
		case WEB:
			action = new WebDeploymentBuilder()
					.installServer()
					.installDatabase()
					.installProjectManager()
					.build();
				break;
		case CONSOLE:
			action = new ConsoleDeploymentBuilder()
					.installDatabase()
					.installProjectManager()
					.build();
				break;
		case WEBMQ:
			action = new WebMQDeploymentBuilder()
					.installMQ()
					.installServer()
					.installDatabase()
					.installProjectManager()
					.build();
				break;
		default:
			action = new BasicDeploymentBuilder()
					.build();
				break;
		}
		
		VMDeployer.deploy(action);
		
	}

}
