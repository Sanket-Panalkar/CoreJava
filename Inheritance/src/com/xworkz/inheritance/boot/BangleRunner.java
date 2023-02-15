package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.things.Bangle;
import com.xworkz.inheritance.things.GoldBangle;
import com.xworkz.inheritance.things.SilverBangle;

public class BangleRunner {

	public static void main(String[] args) {
		// base
		Bangle bangle = new Bangle();
		bangle.getColor();

		// sub
		SilverBangle bangle1 = new SilverBangle();
		bangle1.getColor();
		bangle1.getShape();
		// sub
		GoldBangle bangle2 = new GoldBangle();
		bangle2.getColor();
		bangle2.getPrice();

		Bangle bangle3 = new SilverBangle();
		bangle3.getColor();
		// bangle3.getShape();

		SilverBangle cast = (SilverBangle) bangle;
		cast.getShape();

		Bangle bangle4 = new GoldBangle();
		bangle4.getColor();
		// bengle4.getPrice();

		GoldBangle cast1 = (GoldBangle) bangle;
		cast1.getPrice();

		if (bangle3 instanceof GoldBangle) {
			GoldBangle goldbangle = (GoldBangle) bangle3 ; 
		} else {
			System.err.println("bangle3 is not instance of GoldBangle");
		}

	}   		
		
}

