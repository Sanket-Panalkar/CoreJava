package com.xworkz.object.things;

public class TestCricket extends Cricket {

	private String captainName;
	
	public TestCricket() {
	     System.out.println("no arg const of TestCricket");	
	
	}
	public TestCricket(String captainName) {
		this.captainName=captainName;
	
	}
	public String getCaptianName() {
		System.out.println("getCaptianName() in getCaptianName");
		return this.captainName;
	}
}
