package edu.immune.sw.pattern.decorator.donut;

public class GlazedDonut extends DonutDecorator {

	public GlazedDonut(Donut doughnut) {
		super(doughnut);
	}
	
	@Override
	public void bake(String name) {
		super.bake(name);
		System.out.println("Dip doughnut in the glaze");
		System.out.println("Flip it to harden the glaze");
	}

}
