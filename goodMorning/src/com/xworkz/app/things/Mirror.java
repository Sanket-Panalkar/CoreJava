package com.xworkz.app.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mirror {
	private double height;
	private double weight;
	private String shape;

	@Value("87")
	public void setHeight(double height) {
		this.height = height;
	}

	@Value("12")
	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Mirror(@Value("square") String shape) {
		super();
		this.shape = shape; 
	}
	
	

}
