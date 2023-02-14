package com.xworkz.inheritance.things;

public class Game {

	private String type;

	public Game() {
		System.out.println("no arg constructor of Game");
	}

	public Game(String type) {
		this.type = type;
	}

	public void mode() {
		System.out.println("mode method in Game");
	}

	public String getType() {
		return this.type;
	}

}
