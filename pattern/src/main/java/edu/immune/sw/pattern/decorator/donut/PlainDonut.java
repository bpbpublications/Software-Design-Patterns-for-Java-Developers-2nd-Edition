package edu.immune.sw.pattern.decorator.donut;

public class PlainDonut implements Donut {

	@Override
	public void bake(String name) {
		System.out.printf("Preparing %s! \n", name);
		System.out.println("Mixing ingredients");
		System.out.println("Spooning the mixture in doughnut shapes");
		System.out.println("Baking for 12 minutes in an oven");
	}
}
