package edu.immune.sw.pattern.builder;

public class DeploymentInitiator {
	
	public static void initiate() {
		DeploymentManager.deploy(DeploymentStrategy.WEB);
		System.out.println();
		DeploymentManager.deploy(DeploymentStrategy.CONSOLE);
		System.out.println();
		DeploymentManager.deploy(DeploymentStrategy.WEBMQ);
		System.out.println();
		DeploymentManager.deploy(DeploymentStrategy.VANILLA);
	}
	
	public static void main(String[] args) {
		initiate();
	}

}