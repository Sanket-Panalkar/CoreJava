package com.xworkz.polymorphism.things;

public class LeafGarland extends Garland{

	public LeafGarland() {
		System.out.println("no-arg constructor in LeafGarland");
	}
	public void Durability() {
		System.out.println("Durebility//method in LeafGarland");
	}
	@Override
	public void price() {
		System.out.println("price//method in Garland");
	}
}
