package com.xworkz.app.boot;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collection;

public class ShoeSizeCollectionRunner {

	public static void main(String[] args) {
		Collection<Integer> menShoeSize = new ArrayList<Integer>();
		menShoeSize.add(6);
		menShoeSize.add(7);
		menShoeSize.add(8);
		menShoeSize.add(9);
		menShoeSize.add(10);
		menShoeSize.add(11);
		menShoeSize.add(12);
		menShoeSize.add(13);
		
		Collection<Integer> womensShoeSize = new ArrayList<Integer>();
		womensShoeSize.add(4);
		womensShoeSize.add(5);
		womensShoeSize.add(6);
		womensShoeSize.add(7);
		womensShoeSize.add(8);
		womensShoeSize.add(9);

		Collection<Integer> kidShoeSize = new ArrayList<Integer>();
		kidShoeSize.add(2);
		kidShoeSize.add(3);
		kidShoeSize.add(4);
		kidShoeSize.add(5);

		Collection<Integer> allShoeSize = new ArrayList<Integer>();
		allShoeSize.addAll(menShoeSize);
		
		allShoeSize.addAll(womensShoeSize);
		
		allShoeSize.addAll(kidShoeSize);

		System.out.println("All shoes sizes:" + allShoeSize.size());
		for (int size : allShoeSize) {
			System.out.println("Sizes:" + size);
		}

		boolean containsAll = allShoeSize.containsAll(menShoeSize);
		System.out.println("ContainAll:" + containsAll + " Size:" + allShoeSize.size());

		boolean removed = allShoeSize.removeAll(kidShoeSize);
		System.out.println("Removed:" + removed + " Size:" + allShoeSize.size());

		boolean retain = menShoeSize.retainAll(kidShoeSize);
		System.out.println("Retain:" + retain + " Size:" + allShoeSize.size());

		Object[] array = allShoeSize.toArray();
		System.out.println(Arrays.toString(array));

	}

}
