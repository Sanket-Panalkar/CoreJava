package com.xworkz.object.things;

public class Cricket extends Sport {

	private String country;
	private String coachName;

	public Cricket() {
		System.out.println("no arg constr of Cricket\n--------------------");
	}

	public Cricket(String country, String coachName) {
		this.country = country;
		this.coachName = coachName;
	}

	public String getCountry() {
		System.out.println("getCountry() in Cricket\n--------------------");
		return this.country;
	}

	public String getCoachName() {
		System.out.println("getCoachName() in Cricket\n--------------------");
		return this.coachName;
	}
}
