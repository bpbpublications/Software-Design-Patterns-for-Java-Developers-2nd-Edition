package edu.immune.sw.pattern.builder;

public class VMDeployer {
	
	public static void deploy(DeploymentAction action) {
		System.out.println("Initiating deployment for " + action.getDescription());
		System.out.println("Verifying deployment");
		System.out.println(action.getDescription() + " deployed!");
		
		ImmutableDeploymentAction action1 = new ImmutableDeploymentAction.DeploymentBuilder().build();
		System.out.println(action1);
	}

}
