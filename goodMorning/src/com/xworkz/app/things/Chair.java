package com.xworkz.app.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Chair {

	private String color;
	private String shape;
	private String type;
	
	@Value("red")
	public void setColor(String color) {
		this.color = color;
	}
	@Value("square")
	public void setShape(String shape) {
		this.shape = shape;
	}
	@Value("plastic")
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Chair [color=" + color + ", shape=" + shape + ", type=" + type + "]";
	} 

}
