package com.xworkz.object.things;

public class Pipe {

	private String brand;
	private String color;
	private int diameter;
	private int price;
	
	
	public Pipe() {
	     System.out.println("Pipe method \n ::::::::::");
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		System.out.println("overRide method in Pipe\n:::::::::");
		return "brand: "+brand+" color "+color+" diameter: "+diameter+" price "+price ;
		
	}
}
