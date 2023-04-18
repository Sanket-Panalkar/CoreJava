package com.xworkz.app.boot;

public class HunterRunner {

	public static void main(String[] args) {
		
//		Hunter hunter = new HunterImpl();
//		 hunter.hunt(90);
//		 System.out.println(hunter);
		Hunter hunter = ((value)->{
			System.out.println("running hunter...."+value);
		});
		Util.test(hunter);
	}
	
}
