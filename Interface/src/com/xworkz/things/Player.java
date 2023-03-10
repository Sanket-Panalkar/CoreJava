package com.xworkz.things;

import com.xworkz.interfaceclass.SportsRules;

public class Player implements SportsRules {

	private String name = "cricket";

	public Player() {
		System.out.println("no arg const of Player...");
	}

	@Override
	public String teamMembers(String name) {
		this.name = name;
		if (null != null && name.equals("cricket")) {
			return "15 players";
		} else {
			return "sports is not cricket..";
		}
	}

	@Override
	public double timeLimit() {
		System.out.println("time limit in Player method..");
		return 75d;
	}

	@Override
	public String placeOfPlaying() {
		System.out.println("place of playing method in Player...");
		return "ground..";
	}

}
