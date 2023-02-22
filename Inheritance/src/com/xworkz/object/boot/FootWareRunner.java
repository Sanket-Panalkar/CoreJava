package com.xworkz.object.boot;

import com.xworkz.object.things.equals.FootWare;

public class FootWareRunner {

	public static void main(String[] args) {
		FootWare fw = new FootWare("Nike",9,900);
		System.out.println(fw.toString());
		FootWare fw1 = new FootWare("Bata",8,550);
		FootWare fw2 = new FootWare("Adidas",9,600);
		FootWare fw3 = new FootWare("Adidas",9,600);
		System.out.println(fw1);
		System.out.println(fw.equals(fw));
		System.out.println(fw.equals(fw1));
		System.out.println(fw2.equals(fw3));

	}

}
