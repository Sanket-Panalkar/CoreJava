package com.xworkz.object.boot;

import com.xworkz.object.things.equals.Tv;

public class TvRunner {
	public static void main(String[] args) {
		Tv tv = new Tv("LG", 15000, 30);
		Tv tv3 = new Tv("LG", 15000, 30);
		Tv tv1 = new Tv("Samsung", 45000, 38);
		Tv tv2 = new Tv("Sony", 72000, 55);

		System.out.println(tv.toString());
		System.out.println(tv1.equals(tv));
		System.out.println(tv.equals(tv2));
		System.out.println(tv.equals(null));
        System.out.println(tv.equals(tv));

	}
}