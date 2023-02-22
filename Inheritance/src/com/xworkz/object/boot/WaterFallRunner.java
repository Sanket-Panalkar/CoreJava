package com.xworkz.object.boot;

import com.xworkz.object.things.equals.WaterFall;

public class WaterFallRunner {

	public static void main(String[] args) {
		WaterFall wf = new WaterFall("jogFals",500,"Shivamogga");
		System.out.println(wf.toString());
		WaterFall wf1 = new WaterFall("gokakFals",300,"gokak");
		WaterFall wf2 = new WaterFall("jogFals",500,"Shivamogga");
		System.out.println(wf.equals(wf2));
		
		System.out.println(wf2.equals(wf2));
		
		

	}

}
