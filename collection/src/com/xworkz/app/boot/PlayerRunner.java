package com.xworkz.app.boot;

import com.xworkz.app.functional.Player;

public class PlayerRunner {
	
	public static void main(String[] args) {

		System.err.println("implicitly------------------");
		PlayerUtil.test((ref1, ref2) -> {
			System.out.println("Name: " + ref1);
			return ref1.toUpperCase();
		});
		Util.test((ref1, ref2) -> {
			System.out.println(ref1.toUpperCase() + " " + ref2);
			return ref1;
		});
		Util.test((ref1, ref2) -> {
			System.out.println(ref1.toLowerCase() + " " + ref2);
			return ref1;
		});
		Util.test((ref1, ref2) -> {
			System.out.println(ref1 + " " + ref2);
			return ref1 + ref2;
		});
		System.err.println("explicitly-------------------");
		Player player = (name, state) -> {
			System.out.println("Name in upper case:" + name.toUpperCase());
			System.out.println("Name is lower case:" + name.toLowerCase());
			System.out.println("name:" + name + ", state:" + state);
			return null;
		};
		Util.test(player);
	}
}