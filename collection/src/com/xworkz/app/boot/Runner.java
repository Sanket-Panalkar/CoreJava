package com.xworkz.app.boot;

import java.util.ArrayList;

import java.util.Collection;

public class Runner {
//generic's
	public static void main(String[] args) {
// group ref's
		Collection<Integer> collection = new ArrayList<Integer>();
		collection.add(34);
		Integer ref1 = 99;
		collection.add(ref1);
		collection.add(45);
		collection.add(102);//elements
		collection.add(67);
		collection.hashCode();
		
		int total= collection.size();
		System.out.println("Total "+total);
		
		collection.clear();
		System.out.println("Total "+collection.size());// 0
	}

}