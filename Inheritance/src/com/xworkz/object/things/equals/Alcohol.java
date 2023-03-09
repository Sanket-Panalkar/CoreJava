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
		System.out.println("toString method in Alcohol\n.............");
		return "brand: "+brand+"\npercentage: "+persentage+"\ntype: "+type;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals method in Alcohol....");
		
		if(obj != null) {
			System.out.println("obj is not null...");
			if(obj instanceof Alcohol) {
				System.out.println("obj is instance of Alcohol....");
				Alcohol casted = (Alcohol)obj;
				Alcohol a1 = this; 
				Alcohol a2 = casted;
				if(a1.brand.equals(a2.brand)
						&& a1.persentage == a2.persentage
						&& a1.type.equals(a2.type)) {
					System.out.println("alcohol and alcohol1 are same...");
					return true;
				}
				}else {
				System.out.println("obj is not instance of Alcohol....");
			}
		}else {
			System.out.println("obj is null...");
		}
		
		return super.equals(obj);
	
	}
}
