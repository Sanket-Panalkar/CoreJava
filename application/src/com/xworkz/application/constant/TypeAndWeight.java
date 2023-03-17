package com.xworkz.application.constant;

public enum TypeAndWeight {

	WIRED(20.50),BLUTOOTH(35.00),EARBUDS(15.00);
	
	private final double weight;
	
	private TypeAndWeight(double weight) {
		this.weight=weight;
	}
	
	public double getWeight() {
		return weight;
	}
}
