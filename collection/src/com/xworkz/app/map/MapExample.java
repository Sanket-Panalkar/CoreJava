package com.xworkz.app.map;
import java.util.HashMap;

import java.util.Map;

public class MapExample {
	
	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		//adding values
		map.put(101, "sanket");
		map.put(202, "irfan");
		map.put(608, "annesh");
		map.put(369, "basu");  
		map.put(119, "raju");
		
		System.out.println("all data :\n"+map);
		map.replace(101, "sanket", "irfa");
		System.out.println(map);

		map.remove(101); 
		System.out.println("after removing :\n"+map);
		
		System.out.println(" after replacing :\n"+map);
		//map.clear();
		System.out.println(" after clearing :\n"+map);
		map.replace(608, "rajkumar");
		System.out.println("entry set");
		System.out.println(map.entrySet());
	
		
	}
}
