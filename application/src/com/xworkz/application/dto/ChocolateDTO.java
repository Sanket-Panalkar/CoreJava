package com.xworkz.application.dto;

import java.io.Serializable;
import java.util.Objects;

public class ChocolateDTO implements Serializable{

	private String brand;
	private int price;
	private double weight;
	
	public ChocolateDTO(String brand, int price, double weight) {
		super();
		this.brand = brand;
		this.price = price;
		this.weight = weight;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, price, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChocolateDTO other = (ChocolateDTO) obj;
		return Objects.equals(brand, other.brand) && price == other.price
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}

	@Override
	public String toString() {
		return "ChocolateDTO [brand=" + brand + ", price=" + price + ", weight=" + weight + "]";
	}
	
	
	
}
