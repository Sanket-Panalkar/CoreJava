package com.xworkz.app.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HairDryer {

	private String brand;
	private String type;
	private String color;
	private double weight;
	private int rpm;

	public HairDryer(@Value("nokia") String brand,@Value("plastic") String type,@Value("black") String color,@Value("40") double weight,@Value("600") int rpm) {
		super();
		this.brand = brand;
		this.type = type;
		this.color = color;
		this.weight = weight;
		this.rpm = rpm;
	}

	@Override
	public String toString() {
		return "HairDryer [brand=" + brand + ", type=" + type + ", color=" + color + ", weight=" + weight + ", rpm="
				+ rpm + "]";
	}

}
