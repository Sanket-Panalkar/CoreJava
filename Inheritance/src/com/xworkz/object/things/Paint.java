package com.xworkz.object.things;

public class Paint {

	private String brand;
	private String color;
	private double price;
	private int dryingTime;

	public Paint() {
		System.out.println("no arg const of Paint\n--------------------");
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setDryingTime(int dryingTime) {
		this.dryingTime = dryingTime;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		System.out.println("toString() in Paint\n--------------------");
		return " brand: " + brand + "\n color: " + color + "\n price: " + price + "\n dryingTime: " + dryingTime;
	}

	@Override
	public int hashCode() {
		System.out.println("hashcode() in Paint\n--------------------");
		return super.hashCode();
	}

}
