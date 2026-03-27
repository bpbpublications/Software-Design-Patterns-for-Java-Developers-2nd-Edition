package edu.immune.sw.pattern.builder.builder;

import edu.immune.sw.pattern.builder.DeploymentAction;
import edu.immune.sw.pattern.builder.DeploymentBuilder;
import edu.immune.sw.pattern.builder.DeploymentStrategy;
import edu.immune.sw.pattern.builder.resource.Database;
import edu.immune.sw.pattern.builder.resource.ProjectManager;
import edu.immune.sw.pattern.builder.resource.WebServer;
import edu.immune.sw.pattern.builder.resource.impl.ApacheTomcat;
import edu.immune.sw.pattern.builder.resource.impl.Maven;
import edu.immune.sw.pattern.builder.resource.impl.OracleDatabase;

public class WebDeploymentBuilder implements DeploymentBuilder {

	protected DeploymentAction action;
	protected ProjectManager projectManager;
	protected Database database;
	protected WebServer server;
	
	@Override
	public DeploymentBuilder installServer() {
		System.out.println("Configuring Apache Tomcat");
		server = new ApacheTomcat();
		return this;
	}
	
	@Override
	public DeploymentBuilder installProjectManager() {
		System.out.println("Configuring Maven");
		projectManager = new Maven();
		return this;
	}
	
	@Override
	public DeploymentBuilder installDatabase() {
		System.out.println("Configuring Oracle Database");
		database = new OracleDatabase();
		return this;
	}
	
	@Override
	public DeploymentAction build() {
		if (null == database || null == projectManager || null == server) 
			throw new IllegalStateException();
		
		action = new DeploymentAction();
		action.setDatabase(database);
		action.setProManager(projectManager);
		action.setServer(server);
		action.setDescription(DeploymentStrategy.WEB.strategy());
		return action;
	}

}
