package com.xworkz.string.things;

public class Game {

	public String name = "gta";

	public Game() {
		System.out.println("no arg const of Game");
	}

	public Game(String name) {
		this.name = name;

	}

	@Override
	public String toString() {

		return name;
	}
}
