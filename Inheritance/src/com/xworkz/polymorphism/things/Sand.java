package com.xworkz.polymorphism.things;

public class Sand extends Soil{

	public Sand() {
		System.out.println("no arg constructor of Sand");
	}
	
	public void use() {
		System.out.println("use method in Sand");
	}
	
//	@Override
	public void types() {
		System.out.println("Types method in Sand");
	}
}
