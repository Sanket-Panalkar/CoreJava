package com.xworkz.polymorphism.things;

public class DigitalWatch extends Clock{

	public DigitalWatch() {
	 
		System.out.println("no arg constructor in DigitalWatch");
	}
	
	public void Wristwatches() {
		System.err.println("Wristwatchs//method i DigitalWatch");
	}
	
	@Override
	public void alarm() {
		System.out.println("alarm//method in DigitalWatch");
	}
}
