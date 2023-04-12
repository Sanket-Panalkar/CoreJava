package com.xworkz.app.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class Whiskey {

	public static void main(String[] args) {

		Collection<String> whiskey = new ArrayList<String>();
		whiskey.add("black and white");
		whiskey.add("jim beaim");
		whiskey.add("imperial blue");
		whiskey.add("IBM");
		whiskey.add("MC whiskey");
		whiskey.add("Rc");
		whiskey.add("Jameson Irish");
		whiskey.add("MC signature");
		whiskey.add(null);

		System.out.println("Whiskey size:" + whiskey.size());

		System.out.println("For each loop===============================================");
		for (String loop : whiskey) {
			if (Objects.nonNull(loop)) {
				System.out.println(loop);
			}
		}

		System.out.println(whiskey);
		System.out.println("Whiskey  size :" + whiskey.size());
	}
}
