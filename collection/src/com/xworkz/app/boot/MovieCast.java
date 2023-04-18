package com.xworkz.app.boot;

import java.util.ArrayList;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;

public class MovieCast {

	public static void main(String[] args) {

		Collection<String> movieCast = new ArrayList<String>();
		movieCast.add("Yesh");
		movieCast.add("Ramachandra Raju");
		movieCast.add("Srinidhi Shetty");
		movieCast.add("Vasishta N. Simha");
		movieCast.add("Archana Jois");
		movieCast.add("Kavan");
		movieCast.add("Annesh");
		movieCast.add("Sanket");
		movieCast.add(null);

		System.out.println("Whiskey size:" + movieCast.size());

		System.out.println("For each loop===============================================");
		for (String loop : movieCast) {
			if (Objects.nonNull(loop)) {
				System.out.println(loop);
			}
		}

		System.out.println(movieCast);
		System.out.println("Whiskey  size :" + movieCast.size());

		String name = "Yesh";
		boolean contains = movieCast.contains(name);
		System.out.println(contains);

		boolean remove = movieCast.remove(name);
		System.out.println(remove);

		Collection<String> set = new HashSet<>(movieCast);
		for (String cast : set) {

			int movieCast1 = Collections.frequency(movieCast, cast);
			System.out.println(movieCast1);

		}
	}
}
