package edu.immune.sw.pattern.builder.builder;

import edu.immune.sw.pattern.builder.DeploymentAction;
import edu.immune.sw.pattern.builder.DeploymentBuilder;
import edu.immune.sw.pattern.builder.DeploymentStrategy;
import edu.immune.sw.pattern.builder.resource.Database;
import edu.immune.sw.pattern.builder.resource.ProjectManager;
import edu.immune.sw.pattern.builder.resource.impl.Gradle;
import edu.immune.sw.pattern.builder.resource.impl.MySqlDatabase;

public class ConsoleDeploymentBuilder implements DeploymentBuilder {

	private DeploymentAction action;
	private ProjectManager projectManager;
	private Database database;
	
	@Override
	public DeploymentBuilder installProjectManager() {
		System.out.println("Configuring Gradle");
		projectManager = new Gradle();
		return this;
	}
	
	@Override
	public DeploymentBuilder installDatabase() {
		System.out.println("Configuring MySQL Database");
		database = new MySqlDatabase();
		return this;
	}
	
	@Override
	public DeploymentAction build() {
		if(null == database || null == projectManager) 
			throw new IllegalStateException();
		
		action = new DeploymentAction();
		action.setDatabase(database);
		action.setProManager(projectManager);
		action.setDescription(DeploymentStrategy.CONSOLE.strategy());
		return action;
	}
}
