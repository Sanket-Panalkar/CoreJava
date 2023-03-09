package com.xworkz.object.things.equals;

public class Tv {

	private String brand;
	private int price;
	private int size;

	public Tv(String brand, int price, int size) {
		this.brand = brand;
		this.price = price;
		this.size = size;
	}

	@Override
	public String toString() {

		return "brand: " + brand + "\nprice: " + price + "\nsize: " + size;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals in Tv \n.................");
		if (obj != null) {
			System.out.println("Object is Not null-");
			if (obj instanceof Tv) {
				System.out.println("Object is Tv type can compare-");
				Tv casted = (Tv) obj; // access prop of Tv in parent Class
				Tv tv = this;

				Tv tv2 = casted;
				if (tv.brand.equals(tv2.brand) && tv.price == tv2.price && tv.size == tv2.size) {
					System.out.println("tv and tv2 are same...");
					return true;
				} else {
					System.err.println("tv and tv2 are not same...");
				}
			} else {
				System.err.println("obj is not Tv, will not compare-");
			}

		} else {
			System.err.println("Object is null can't compare the data-");
		}

		return super.equals(obj);

	}

}
