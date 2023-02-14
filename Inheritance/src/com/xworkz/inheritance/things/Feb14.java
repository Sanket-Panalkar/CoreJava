package com.xworkz.inheritance.things;

public class Feb14 {

	private String year;

	public Feb14() {
		System.out.println("no arg const of Feb14");
	}

	public Feb14(String year) {
		this.year = year;
	}

	public void day() {
		System.out.println("day method of Feb14");
	}

	public String getYear() {
		return year;
	}
}
