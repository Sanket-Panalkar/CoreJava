package com.xworkz.object.boot;

import com.xworkz.object.things.equals.Tv;

public class TvRunner {
	public static void main(String[] args) {
		Tv tv = new Tv("Samsung", 45000, 38);
		Tv tv1 = new Tv("Samsung", 45000, 38);
		Tv tv2 = new Tv("LG", 15000, 30);
		Tv tv3 = new Tv("LG", 15000, 30);

		System.out.println(tv.toString());

		System.out.println(tv.equals(tv2));
		System.out.println(tv.equals(null));
		System.out.println(tv.equals(tv));
		System.out.println(tv.equals(tv1));
		System.out.println(tv2.equals(tv3));
		System.out.println(tv1.equals(tv3));

	}
}