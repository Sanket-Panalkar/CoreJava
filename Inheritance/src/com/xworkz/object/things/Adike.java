package com.xworkz.object.things;

public class Adike {

	private String name;
	private String location;
	private int price;
	private String color;

	public Adike() {
		System.out.println("no- rg const of Adike\n---------------------");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		System.out.println("toString() in Adike\n-------------------");
		return "name: " + name + "\nlocation: " + location + "\nprice: " + price + "\nscolor: " + color;
	}

	@Override
	public int hashCode() {
		System.out.println("hashcode() in Adike\n-------------------");
		return super.hashCode();
	}

}
