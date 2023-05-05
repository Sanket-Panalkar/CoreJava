package com.xworkz.app.map;

import java.util.HashMap;



import java.util.Map;

public class Company {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(111, "Wipro \n");
		map.put(112, "TCS \n");
		map.put(113, "Bosch \n");
		map.put(114, "Dell\n");
		map.put(115, "Apple \n");
		map.put(116, "Samsung \n");
		map.put(117, "Louis Vuitton \n");
		map.put(118, "Toyota \n");
		map.put(119, "McDonald's \n");
		map.put(120, "Microsoft \n");

		
		System.out.print("no of data : ");
		System.out.println(map.size()); 
		
		System.out.println("remove data :");
		map.remove(114);
		System.out.println(map);    
		
		System.out.println("replace :");
		map.replace(120, "intel \n");
		System.out.println(map);
		System.out.println(" key set \n"+map.keySet());
		System.out.println(" values \n"+map.values());
		System.out.println(" entry set \n "+map.entrySet());
		
		
	}
} 
