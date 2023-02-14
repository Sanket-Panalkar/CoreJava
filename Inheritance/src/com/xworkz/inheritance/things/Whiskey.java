package com.xworkz.inheritance.things;

public class Whiskey {

	private String brand;

	public Whiskey() {
		System.out.println("no arg constructor of Whiskey");
	}

	public Whiskey(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

}
