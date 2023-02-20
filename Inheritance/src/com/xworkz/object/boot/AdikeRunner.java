package com.xworkz.object.boot;

import com.xworkz.object.things.Adike;

public class AdikeRunner {

	public static void main(String[] args) {
		Adike adike = new Adike();
		adike.setName("Adike");
		adike.setPrice(25);
		adike.setLocation("Karnataka");
		adike.setColor("brown");
		// toString method
		System.out.println(adike.toString());
		// hashCode method
		System.out.println(adike.hashCode());
		System.out.println("Adike".hashCode());
		System.out.println("Karnataka".hashCode());
		System.out.println("brown".hashCode());
		// equals method
		System.out.println(adike.equals(adike));
		System.out.println("=================================");
		Adike adike1 = new Adike();
		adike1.setName("Adike");
		adike1.setPrice(50);
		adike1.setLocation("Kerala");
		adike1.setColor("red");
		System.out.println(adike1.toString());
		System.out.println(adike1.hashCode());
		System.out.println("red".hashCode());
		System.out.println(adike.equals(adike1));

	}
}
