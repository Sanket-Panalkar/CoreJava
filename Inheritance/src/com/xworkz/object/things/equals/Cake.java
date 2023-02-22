package com.xworkz.object.things.equals;

public class Cake {
	private String flavour;
	private int weight;
	private String shape;
	private int price;

	public Cake(String flavour, int weight, String shape, int price) {
		this.flavour = flavour;
		this.weight = weight;
		this.shape = shape;
		this.price = price;
	}

	@Override
	public String toString() {
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		return "flavour: " + flavour + "\nweight: " + weight + "\nshape: " + shape + "\nprice: " + price;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals in Cake \n.................");
		if (obj != null) {
			System.out.println("Object is not null..");
			if(obj instanceof Cake) {
				System.out.println("Object is Cake type can compare..");
				Cake casted = (Cake)obj;
			}else {
				System.err.println("obj is not Cake...");
			}

		} else {
			System.err.println("Object is null can't compare the data..");
		}
		return false;
	

		
		
	}
	
	
}