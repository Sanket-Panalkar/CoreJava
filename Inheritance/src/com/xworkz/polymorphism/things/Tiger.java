package com.xworkz.polymorphism.things;

public class Tiger extends Animal{

	public Tiger() {
		System.out.println("no-arg constructor of Tiger");
	}
	@Override
	public void located() {
		System.out.println("located//method in Tiger");
	}
}
