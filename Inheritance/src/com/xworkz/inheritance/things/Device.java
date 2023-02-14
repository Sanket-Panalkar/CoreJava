package com.xworkz.inheritance.things;

public class Device {

	private String type;
	
	public Device() {
		System.out.println("no arg const in Device");
	}
	public void operator() {
		System.out.println("operator method in Device");
	}
	public String getType() {
		return type;
	}
	
	
}
