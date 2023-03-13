package com.xworkz.things;

import com.xworkz.interfaceclass.EatingRule;

public class Customer implements EatingRule {
	private String name;

	public Customer() {
		System.out.println("no arg constructor of Customer..");
	}

	@Override 
	public boolean washedHands(String name) {
		System.out.println("washedHands method in customer....");
		this.name = name;
		if (name != null || name.equals("sanket")) {
			System.out.println("sanket is washed hands...");
			return true;
		} else {
			System.out.println("sanket is not washing hands...");
			return false;
		}

	}

	@Override
	public double durationTaken() {
		System.out.println("duration taken method in customer...");
		if (this.name == "sanket") {
			return 50;
		} else {
			return 20;
		}

	}

}
