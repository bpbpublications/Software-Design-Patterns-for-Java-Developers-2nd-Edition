package edu.immune.sw.pattern.decorator.donut;

public abstract class DonutDecorator implements Donut {

	private Donut doughnut;
	
	public DonutDecorator(Donut doughnut) {
		this.doughnut = doughnut;
	}
	
	@Override
	public void bake(String name) {
		doughnut.bake(name);
	}
	
}
