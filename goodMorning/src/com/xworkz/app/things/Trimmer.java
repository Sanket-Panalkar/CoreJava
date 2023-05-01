package com.xworkz.app.things;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Trimmer {

	private String brand;
	private String color;
	private int price;
	private double heidht;

	public Trimmer(@Value("white") String color, @Value("999") int price, @Value("24") double heidht) {
		super();
		this.color = color;
		this.price = price;
		this.heidht = heidht;
	}

	@Value("philips")
	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Trimmer [brand=" + brand + ", color=" + color + ", price=" + price + ", heidht=" + heidht + "]";
	}

}
