package com.xworkz.object.things.equals;

public class WaterFall {
	private String name;
	private int hight;
	private String location;
	
	public WaterFall() {
		System.out.println("no arg constr of WaterFall....");
	}
	public WaterFall(String name, int hight, String location) {
		System.out.println("arg constr of WaterFall....");
		this.name=name;
		this.hight=hight;
		this.location=location;
	}
	@Override
	public String toString() {
		System.out.println("to string method in WaterFall....");
		return "name: "+name+"\nhight: "+hight+"\nlocation: "+location;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals method in WaterFall....");
		
		if(obj != null) {
			System.out.println("obj is not null...");
			if(obj instanceof WaterFall) {
				System.out.println("obj is instance of Waterfall....");
				WaterFall casting = (WaterFall)obj;
				
			}else {
				System.out.println("obj is not instance of WaterFall....");
			}
		}else {
			System.out.println("obj is null...");
		}
		
		return super.equals(obj);
	}

}
