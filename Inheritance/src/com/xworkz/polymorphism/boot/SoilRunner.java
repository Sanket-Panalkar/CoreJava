package com.xworkz.polymorphism.boot;

import com.xworkz.polymorphism.things.Sand;
import com.xworkz.polymorphism.things.Soil;

public class SoilRunner {

	public static void main(String[] args) {
		
	    Soil soil = new Sand();
	    soil.texture();
		soil.types();		
	}
}
