package com.xworkz.app.boot;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.stream.Collectors;

import com.xworkz.app.dto.GroceryDTO;

public class GroceryRunner {

	public static void main(String[] args) {

		Set<GroceryDTO> grocery = new HashSet<>();

		grocery.add(new GroceryDTO(10, "aapple", 4));
		grocery.add(new GroceryDTO(15, "milk", 3));
		grocery.add(new GroceryDTO(20, "curd", 7));
		grocery.add(new GroceryDTO(50, "oil", 5));
		grocery.add(new GroceryDTO(23, "cake", 2));
		grocery.add(new GroceryDTO(23, "badam", 12));

		System.out.println("printing all grocery---");
		grocery.forEach(e->System.out.println(e));
		System.out.println("================================");
		
		System.out.println("using list-------");
		List<GroceryDTO> grocery1 = new ArrayList<>(grocery);
		grocery.stream().collect(Collectors.toList());
		
		System.out.println("ading new grocerys in to list---");
		grocery1.add(2,new GroceryDTO(40, "oil", 13));
		
		System.out.println("$$$$$$eeeeeTTTTT");
		grocery1.set(4, new GroceryDTO(5, "butter", 57));
		grocery1.forEach(e->System.out.println(e));
		
		System.out.println("--------------remove");
		grocery.remove(5);
		grocery1.forEach(e->System.out.println(e));
		
		System.out.println("------iterator reverce");
		ListIterator<GroceryDTO> reverce = grocery1.listIterator(3);
		
		while(reverce.hasPrevious()) {
			GroceryDTO privious = reverce.previous();
			System.out.println(privious);
		}
		
		
		
		
//		System.out.println(grocery.addAll(grocery));
//		
//		grocery.forEach(ref->System.out.println(ref));
//		System.out.println("----------------------------------------");
//		
//		List<GroceryDTO> list = new ArrayList<>(grocery);
//		grocery.stream()
//				.collect(Collectors.toList())
//					.forEach(ref->System.out.println(ref));
//		
//		System.out.println("-----------------------------------------");
//		
//		list.add(new GroceryDTO(80, "fish", 11));
//		grocery.stream()
//		.collect(Collectors.toList())
//			.forEach(ref->System.out.println(ref));
//		
//		System.out.println("-------------------get method---------------------");
//		
//		System.out.println(list.get(2)); 
//		System.out.println(list.get(3));
		
	}
}
