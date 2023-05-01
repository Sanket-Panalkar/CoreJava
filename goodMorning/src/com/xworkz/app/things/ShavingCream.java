package com.xworkz.app.things;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

@Component
public class ShavingCream {

	private String brand;
	private double price;
	private double weight;
	
	@Value("64")
	public void setPrice(double price) {
		this.price = price;
	}
	@Value("3")
	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "ShavingCream [brand=" + brand + ", price=" + price + ", weight=" + weight + "]";
	}
	
	public ShavingCream(@Value("patanjali") String brand) {
		super();
		this.brand = brand;

	}

}
