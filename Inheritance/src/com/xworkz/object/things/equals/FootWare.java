package com.xworkz.object.things.equals;

public class FootWare {
	private String brand;
	private int size;
	private int price;

	public FootWare(String brand, int size, int price) {
		this.brand = brand;
		this.size = size;
		this.price = price;
	}

	@Override
	public String toString() {

		return "brand: " + brand + "\nsize: " + size + "\nprice: " + price;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals in FootWare \n.................");
		if (obj != null) {
			System.out.println("Object is Not null-");
			if(obj instanceof FootWare) {
				System.out.println("Object is FootWare type can compare-");
				FootWare casted = (FootWare)obj; //access prop of Tv in Object
			}else {
				System.err.println("obj is not FootWare, will not compare-");
			}

		} else {
			System.err.println("Object is null can't compare the data-");
		}

		return super.equals(obj);
	}

}
