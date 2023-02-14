package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.things.CandyCrash;
import com.xworkz.inheritance.things.Game;

public class GameRunner {

	public static void main(String[] args) {
		CandyCrash cdc = new CandyCrash();
		cdc.size();
		cdc.mode();
		cdc.getType();

		Game game = new Game();
		game.mode();
		game.getType();

		Game game1 = new CandyCrash();
		game.mode();
		game.getType();

		CandyCrash cast = (CandyCrash) game1;
		cast.size();
	}
}
