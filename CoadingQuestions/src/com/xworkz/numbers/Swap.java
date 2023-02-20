package com.xworkz.numbers;

public class Swap {

	static int a = 2;
	static int b = 4;
	static int x ;
	public static void main(String[] args) {

		 System.out.println(a +" "+ b);
		 
		 x = a;    // a=2|b=4;  x=a>>x=2; 
		 a = b;    // a=2;      a=b >> a=4;
		 b = x;    // b=4|x=2;  b=x >> b=2;
		 
		 System.out.println(a +" "+ b);

	}

}
