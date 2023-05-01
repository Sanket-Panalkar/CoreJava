package com.xworkz.app.things;

import org.springframework.stereotype.Component;

@Component
public class Mirror {
	private double height;
	private double weight;
	private String shape;
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Mirror(String shape) {
		super();
		this.height = height;
		
		this.shape = shape;
	}
	
	

}
