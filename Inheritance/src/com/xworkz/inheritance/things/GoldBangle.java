package com.xworkz.inheritance.things;

public class GoldBangle extends Bangle {

	private double price;

	public GoldBangle() {
		System.out.println("no argument constructor of GoldBangle");
	}

	public double getPrice() {
		System.out.println("getPrice() in GoldBangle");
		return price;
	}
}
