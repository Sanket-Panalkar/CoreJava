package com.xworkz.object.things.equals;

public class Alcohol {
	private String brand;
	private int persentage;
	private String type;

	public Alcohol(String brand, int percentage , String type) {
		this.brand=brand;
		this.persentage=percentage;
		this.type=type;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "brand: "+brand+"\npercentage: "+persentage+"\ntype: "+type;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals method in Alcohol....");
		
		if(obj != null) {
			System.out.println("obj is not null...");
			if(obj instanceof Alcohol) {
				System.out.println("obj is instance of Alcohol....");
				Alcohol casting = (Alcohol)obj;
				
			}else {
				System.out.println("obj is not instance of Alcohol....");
			}
		}else {
			System.out.println("obj is null...");
		}
		
		return super.equals(obj);
}
}
