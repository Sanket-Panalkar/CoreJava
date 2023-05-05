package com.xworkz.app.map;

import java.util.HashMap;



import java.util.Map;

public class Mall {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(111, "Westfield Mall \n");
		map.put(112, "Mall of America \n");
		map.put(113, "The Dubai Mall \n");
		map.put(114, "Ala Moana Center \n");
		map.put(115, "Chadstone Shopping Centre \n");
		map.put(116, "SM Mall of Asia \n");
		map.put(117, "Galleria Vittorio Emanuele II \n");
		map.put(118, "Siam Paragon \n");
		map.put(119, "West Edmonton Mall \n");
		map.put(120, "Pacific Place \n");

		
		System.out.print("no of data : ");
		System.out.println(map.size()); 
		
		System.out.println("remove data :");
		map.remove(116);
		System.out.println(map);    
		
		System.out.println("replace :");
		map.replace(118, "Orion Mall \n");
		System.out.println(map);
		System.out.println(" key set \n"+map.keySet());
		System.out.println(" values \n"+map.values());
		System.out.println(" entry set \n "+map.entrySet());
		
		
	}
} 
