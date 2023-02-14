package com.xworkz.inheritance.things;

public class Sports {

	public String place;

	public Sports() {
		System.out.println("no arg const of Sports");
	}

	public Sports(String place) {
		this.place = place;
	}

	public void getPlace() {
		System.out.println("getPlace method in Sports");
	}
}
