package com.xworkz.polymorphism.boot;

import com.xworkz.polymorphism.things.Garland;
import com.xworkz.polymorphism.things.LeafGarland;

public class GarlandRunner {

	public static void main(String[] args) {
		Garland garland = new LeafGarland();
		garland.length();
		garland.price();
	}
}
