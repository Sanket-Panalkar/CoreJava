package com.xworkz.inheritance.things;

public class Camera extends Device {
	public Camera() {
		System.out.println("no arg const in camera");
	}

	public void capture() {
		System.out.println("Catture method in camera");
	}

}
