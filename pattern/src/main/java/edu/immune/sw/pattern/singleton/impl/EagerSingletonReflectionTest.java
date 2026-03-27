package edu.immune.sw.pattern.singleton.impl;

import java.lang.reflect.Constructor;

/**
 * This example demonstrates how reflection breaks a eagerly initialized singleton 
 * 
 * @author Lalit Mehra
 *
 */
public class EagerSingletonReflectionTest {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		EagerSingleton instanceOne = EagerSingleton.getInstance();
		EagerSingleton instanceTwo = null;

		Constructor[] constructors = EagerSingleton.class.getDeclaredConstructors();
		constructors[0].setAccessible(true);
		try {
			instanceTwo = (EagerSingleton) constructors[0].newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}

		instanceOne.incrementCount();
		instanceOne.incrementCount();
		instanceTwo.incrementCount();

		System.out.println(instanceOne.getCount());
		System.out.println(instanceTwo.getCount());
	}

}