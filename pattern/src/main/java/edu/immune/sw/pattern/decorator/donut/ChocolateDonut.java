package edu.immune.sw.pattern.decorator.donut;

public class ChocolateDonut extends DonutDecorator {

	public ChocolateDonut(Donut doughnut) {
		super(doughnut);
	}
	
	@Override
	public void bake(String name) {
		super.bake(name);
		System.out.println("Pouring Chocolate Syrup");
		System.out.println("Decorating with ZigZag lines");
	}

}
