package com.xworkz.app.map;

import java.util.HashMap;


import java.util.Map;

public class SoftwareDetails {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(111, "AdobeXd \n");
		map.put(112, "Photoshop \n");
		map.put(113, "Windows \n");
		map.put(114, "Antivirous \n");
		map.put(115, "Vlender \n");
		map.put(116, "JRE \n");
		map.put(117, "AnyDisck \n");
		map.put(118, "primerpro \n");
		map.put(119, "vlcPlayer \n");
		map.put(120, "MsWorld \n");
		
		System.out.print("no of data : ");
		System.out.println(map.size()); 
		
		System.out.println("remove data :");
		map.remove(111);
		System.out.println(map);    
		
		System.out.println("replace :");
		map.replace(117, "Chrome \n");
		System.out.println(map);
		
		System.out.println(" key set \n"+map.keySet());
		
		System.out.println(" values \n"+map.values());
		
		System.out.println(" entry set \n "+map.entrySet());
		
		
	}
} 
