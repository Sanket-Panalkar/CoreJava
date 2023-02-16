package com.xworkz.polymorphism.boot;

import com.xworkz.polymorphism.things.Animal;
import com.xworkz.polymorphism.things.Tiger;

public class AnimalRunner {

	public static void main(String[] args) {
		
		Animal animal = new Tiger();
		animal.types();
		animal.located();
	}
}
