package com.xworkz.object.boot;

import com.xworkz.object.things.equals.Alcohol;

public class AlcoholRunner {

	public static void main(String[] args) {
		
		
		Alcohol a1 = new Alcohol("KF",45,"altra");
		Alcohol a2 = new Alcohol("KF",45,"altra");
		Alcohol a3 = new Alcohol("OMR",50,"Rum");
		Alcohol a4 = new Alcohol("OMR",50,"Rum");
	
		System.out.println(a1.toString());
		System.out.println("==========================");
		System.out.println(a2.toString());
		System.out.println("==========================");
		System.out.println(a3.toString());
		System.out.println("==========================");
		System.out.println(a1.equals(a2));
		System.out.println("==========================");
		System.out.println(a2.equals(a4));
		
		
		
		
		
		
		
		
	}
}
