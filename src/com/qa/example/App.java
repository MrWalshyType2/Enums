package com.qa.example;

public class App {
	public static void main(String[] args) {
		double earthWeight = Double.parseDouble("175");
		// A method can be run against a specific value in an enum
		double mass = earthWeight / Planet.EARTH.surfaceGravity();

		// Iterating through enum values
		for (Planet p : Planet.values()) {
			System.out.printf("Your weight on %s, is %f%n", p, p.surfaceWeight(mass));
		}
	}
}
