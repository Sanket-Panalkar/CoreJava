package com.xworkz.app.map;

import java.util.HashMap;


import java.util.Map;

public class SoftwareCourses {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(111, "java \n");
		map.put(112, "python \n");
		map.put(113, "ML \n");
		map.put(114, "C++ \n");
		map.put(115, "selenium \n");
		map.put(116, "dotnet \n");
		map.put(117, "IOT \n");
		map.put(118, "DSA \n");
		map.put(119, "WebDevalopment \n");
		map.put(120, "CloudComputing \n");
		
		System.out.print("no of data : ");
		System.out.println(map.size()); 
		
		System.out.println("remove data :");
		map.remove(116);
		System.out.println(map);    
		
		System.out.println("replace :");
		map.replace(118, "Devops \n");
		System.out.println(map);
		System.out.println(" key set \n"+map.keySet());
		System.out.println(" values \n"+map.values());
		System.out.println(" entry set \n "+map.entrySet());
		
		
	}
} 
