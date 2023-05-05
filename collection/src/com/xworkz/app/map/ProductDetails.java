package com.xworkz.app.map;

import java.util.HashMap;

import java.util.Map;

public class ProductDetails {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(111, "Laptop \n");
		map.put(112, "Mobile \n");
		map.put(113, "Watch \n");
		map.put(114, "Earphone \n");
		map.put(115, "Charger \n");
		map.put(116, "Tv \n");
		map.put(117, "CD \n");
		map.put(118, "Motherboard \n");
		map.put(119, "Pendrive \n");
		map.put(120, "Projector \n");
		
		System.out.print("no of data : ");
		System.out.println(map.size()); 
		
		System.out.println("remove data :");
		map.remove(111);
		System.out.println(map);    
		
		System.out.println("replace :");
		map.replace(117, "Monitor \n");
		System.out.println(map);
		System.out.println(" key set \n"+map.keySet());
		System.out.println(" values \n"+map.values());
		System.out.println(" entry set \n "+map.entrySet());
		
		
	}
} 
