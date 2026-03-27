package edu.immune.sw.pattern.builder;

import edu.immune.sw.pattern.builder.resource.Database;
import edu.immune.sw.pattern.builder.resource.MessagingQueue;
import edu.immune.sw.pattern.builder.resource.ProjectManager;
import edu.immune.sw.pattern.builder.resource.WebServer;
import edu.immune.sw.pattern.builder.resource.impl.ApacheTomcat;
import edu.immune.sw.pattern.builder.resource.impl.Maven;
import edu.immune.sw.pattern.builder.resource.impl.OracleDatabase;
import edu.immune.sw.pattern.builder.resource.impl.RabbitMQ;

public class ImmutableDeploymentAction {

	private WebServer server;
	private Database database;
	private MessagingQueue queue;
	private ProjectManager proManager;

	public ImmutableDeploymentAction(DeploymentBuilder builder) {
		this.server = builder.server;
		this.database = builder.database;
		this.proManager = builder.proManager;
		this.queue = builder.queue;
	}

	public static class DeploymentBuilder {
		
		private WebServer server;
		private Database database;
		private MessagingQueue queue;
		private ProjectManager proManager;
		
		public DeploymentBuilder installServer() {
			this.server = new ApacheTomcat();
			return this;
		}
		
		public DeploymentBuilder installDatabase() {
			this.database = new OracleDatabase();
			return this;
		}
		
		public DeploymentBuilder installQueue() {
			this.queue = new RabbitMQ();
			return this;
		}
		
		public DeploymentBuilder installProjectManager() {
			this.proManager = new Maven();
			return this;
		}
		
		public ImmutableDeploymentAction build() {
			return new ImmutableDeploymentAction(this);
		}
		
	}

}
