package com.xworkz.app.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class Fruits {

	public static void main(String[] args) {
		
		Collection<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Watermelon");
		fruits.add("Orange");
		fruits.add("Pear");
		fruits.add("Cherry");
		fruits.add("Strawberry");
		fruits.add("Nectarine");
		fruits.add("Grape");
		fruits.add("Pomegranate");
		fruits.add("Mango");
		fruits.add("Blueberry");
		fruits.add("starfruit");
		fruits.add("Plum");
		fruits.add("Banana");
		fruits.add("Mandarin");
		fruits.add("Raspberry");
		fruits.add("Jackfruit");
		fruits.add("Papaya");
		fruits.add("Avocado");
		fruits.add("Kiwi");
		fruits.add("Pineapple");
		fruits.add("Lime");
		fruits.add("Lemon");
		fruits.add("Apricot");
		fruits.add("Coconut");
		
		System.out.println(">>>>>>>>>>>>>> using for each loop");
		for (String ref : fruits) {
			System.out.println("- "+ref);
		}
		System.out.println(">>>>>>>>>>>>>> using for each method");
		fruits.forEach(ref-> { System.out.println("- "+ref);});
		
		System.out.println(">>>>>>>>>>>>>> converting all fruits into upper case");
		fruits.stream().map(e->e.toUpperCase()).collect(Collectors.toList()).forEach(e->System.out.println("- "+e));
		System.out.println(">>>>>>>>>>>>>> converting all fruits into lower case");
		fruits.stream().map(e->e.toLowerCase()).collect(Collectors.toList()).forEach(e->System.out.println("- "+e));
		System.out.println(">>>>>>>>>>>>>> collecting fruits if fruit-length is less then 5");
		fruits.stream().filter(e->e.length()>5).collect(Collectors.toList()).forEach(e->System.out.println("- "+e));
		System.out.println(">>>>>>>>>>>>>> collecting fruits if fruit-length is greter then 5");
		fruits.stream().filter(e->e.length()<5).collect(Collectors.toList()).forEach(e->System.out.println("- "+e));
	}
}
