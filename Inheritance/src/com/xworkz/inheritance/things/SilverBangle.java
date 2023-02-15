package com.xworkz.inheritance.things;

public class SilverBangle extends Bangle {

	private String shape;

	public SilverBangle() {

		System.out.println("no arg constructor of SilverBangle");
	}

	public String getShape() {

		System.out.println("getShape() in SilverBangle");
		return shape;
	}
	
}
