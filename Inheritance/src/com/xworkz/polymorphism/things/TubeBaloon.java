package com.xworkz.polymorphism.things;

public class TubeBaloon extends Baloon{

	public TubeBaloon() {
		
		System.out.println("no arg constructor in TubeBaloon");
	}
	
    @Override
	public void material() {
		System.out.println("elasticity method in TubeBaloon");
	}
}
