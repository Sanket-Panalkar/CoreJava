package com.xworkz.object.boot;

import com.xworkz.object.things.equals.Cake;

public class CakeRunner {
	public static void main(String[] args) {
		
		Cake cake = new Cake("mango",3,"circle",600);
		Cake cake1 = new Cake("venela",3,"square",500);
		Cake cake2 = new Cake("choclate", 5, "circle", 450);
		System.out.println(cake);
		System.out.println(cake.toString());
		System.out.println(cake1.equals(cake));
		System.out.println(cake);
	    
		
	}
}
