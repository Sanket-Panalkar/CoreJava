package com.xworkz.object.things;

public class Sport {

	private int total;
	
	public Sport() {
		System.out.println("no arg const of Sport...");
	}
	
	public Sport(int total) {
		this.total=total;
	}
	
	public int getTotal() {
		System.out.println("getTotal() in Sport-");
		return this.total;
	}
}
