package com.xworkz.object.boot;

import com.xworkz.object.things.Paint;

public class PaintRunner {

	public static void main(String[] args) {

		Paint paint = new Paint();
		System.out.println("paint instance of Paint --------");
		System.out.println(paint.toString());
		paint.setBrand("JSW");
		paint.setColor("Blue");
		paint.setDryingTime(2);
		paint.setPrice(250.0d);
		paint.toString();
		
		System.out.println(paint.toString());
		System.out.println(paint.hashCode());
		paint.equals(paint);
		System.out.println("-" + paint.equals(paint));

		Paint paint1 = new Paint();
		System.out.println("paint1 instance of Paint --------");
		System.out.println(paint1);
		paint1.setBrand("AsianPaints");
		paint1.setColor("Red");
		paint1.setDryingTime(6);
		paint1.setPrice(399.0d);
		System.out.println(paint1.toString());
		System.out.println("-" + paint.equals(paint1));

	}
}
