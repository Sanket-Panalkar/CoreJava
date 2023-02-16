package com.xworkz.polymorphism.boot;

import com.xworkz.polymorphism.things.Bulb;
import com.xworkz.polymorphism.things.TubeLight;

public class TubeLightRunner {
   
	public static void main(String[] args) {
		
		TubeLight tblight = new Bulb();
		tblight.shape();
		tblight.light();
		}
}
