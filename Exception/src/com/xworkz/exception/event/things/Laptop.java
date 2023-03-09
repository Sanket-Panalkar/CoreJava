package com.xworkz.exception.event.things;

public class Laptop {
	
	void comput () {
		System.out.println(" hello");
	}
	
	
	public static void main(String a[]) {
		System.out.println("Hello World");
		Laptop laptop = new Laptop();
		laptop.comput();
		laptop.comput();
	}

}