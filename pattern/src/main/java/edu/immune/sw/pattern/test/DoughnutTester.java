package edu.immune.sw.pattern.test;

import edu.immune.sw.pattern.decorator.donut.ChocolateDonut;
import edu.immune.sw.pattern.decorator.donut.Donut;
import edu.immune.sw.pattern.decorator.donut.GlazedDonut;
import edu.immune.sw.pattern.decorator.donut.PlainDonut;

public class DoughnutTester {

	public static void main(String[] args) {
		Donut doughnut = new PlainDonut();
		doughnut.bake("Doughnut");
		
		System.out.println();
		Donut chocolateDoughnut = new ChocolateDonut(doughnut);
		chocolateDoughnut.bake("Chocolate Doughnut");
		
		System.out.println();
		Donut glazedDoughnut = new GlazedDonut(doughnut);
		glazedDoughnut.bake("Glazed Doughnut");
		
		System.out.println();
		Donut glazedChocolateDoughnut = new GlazedDonut(chocolateDoughnut);
		glazedChocolateDoughnut.bake("Glazed Chocolate Doughnut");
	}
	
}
