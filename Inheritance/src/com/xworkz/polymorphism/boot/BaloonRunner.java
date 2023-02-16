package com.xworkz.polymorphism.boot;

import com.xworkz.polymorphism.things.Baloon;
import com.xworkz.polymorphism.things.TubeBaloon;

public class BaloonRunner {

	public static void main(String[] args) {
		
		Baloon baloon = new TubeBaloon();
		baloon.elasticity();
		baloon.material();
	}
}
