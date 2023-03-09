package com.xworkz.string.things;

public class GameRunner {

	public static void main(String[] args) {
		Game game = new Game("watchdogs");
		Game game1 = new Game("playerunknownbattalgrounds");
     	String ref = game.toString();
     	String ref1 = game1.toString();
 		System.out.println(ref);
		System.out.println(ref.charAt(0));
		System.out.println(ref.codePointAt(0)+" "+ref.codePointAt(2));
		System.out.println(ref.codePointBefore(4));
		System.out.println(ref.codePointCount(0, 1));
		System.out.println(ref.compareTo(ref1));
		System.out.println(ref.compareToIgnoreCase(ref1));
		System.out.println(ref.concat(ref1));
		System.out.println(ref.contains(ref1));
		
	}
	
}
