package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.things.Alcohol;
import com.xworkz.inheritance.things.Whiskey;

public class WhiskeyRunner {

	public static void main(String[] args) {

		Alcohol alcohol = new Alcohol();
		alcohol.toDrink();
		alcohol.getBrand();

		Whiskey whiskey = new Whiskey();
		whiskey.getBrand();
		
		Whiskey whiskey1 = new Alcohol();
		whiskey.getBrand();
		Alcohol cast = (Alcohol)whiskey1;

	}

}
