package com.xworkz.app.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Scissor {

	private String type;
	private double weight;
	private String color;

	public void setType(String type) {
		this.type = type;
	}

	@Value("5")
	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Scissor(@Value("metal") String type, @Value("silver") String color) {
		super();
		this.type = type;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Scissor [type=" + type + ", weight=" + weight + ", color=" + color + "]";
	}

//	public Scissor() {
//		// TODO Auto-generated constructor stub
//	}

}
