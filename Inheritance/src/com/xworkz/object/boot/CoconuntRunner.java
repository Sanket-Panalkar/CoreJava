package com.xworkz.object.boot;

import com.xworkz.object.things.Coconut;

public class CoconuntRunner {

	public static void main(String[] args) {
		
		Coconut coconut = new Coconut();
	    coconut.setName("coconut");
	    coconut.setOrigin("Cocos");
	    coconut.setColor("green");
	    coconut.setSize(25.00f);
		System.out.println(coconut.toString());
		System.out.println(coconut.hashCode());
		System.out.println(coconut.equals(coconut));
		
		System.out.println("=================================");
	    Coconut coconut1 = new Coconut();
	    coconut.setName("coconut");
	    coconut.setOrigin("Cocos");
	    coconut.setColor("brown");
	    coconut.setSize(83.00f);
	    System.out.println(coconut1.toString());
	    System.out.println(coconut1.hashCode());
	    System.out.println(coconut.equals(coconut1));
	    
	    
	}
}
