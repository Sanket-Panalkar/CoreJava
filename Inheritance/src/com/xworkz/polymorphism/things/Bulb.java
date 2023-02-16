package com.xworkz.polymorphism.things;

public class Bulb extends TubeLight{

	public Bulb() {
	     System.out.println("no-arg constructor of Bulb");
	}
	
	@Override
	public void light() {
		System.out.println("light method in Bulb");
	}
}
