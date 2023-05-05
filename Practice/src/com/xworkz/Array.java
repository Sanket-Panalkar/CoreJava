package com.xworkz;

public class Array {

	public static void main(String[] args) {

		int[] list = new int[4];
		list[0] = 4;
		list[1] = 2;
		list[2] = 8;
		list[3] = 9;
		// list[4]=7;
		System.out.println(list[3]);
		
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		System.out.println("-----");
		//printing all elements in for-each loop -->
		for(int ref:list) {
			System.out.println(ref);
		}
		System.err.println("===========================");
		String[] names = {"sanket","annesh","kyarmal"};
		System.out.println(names[2]);
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		/*   Limitations of Arrays -->
		 
		 1. arrays are having fixed size,
		 2. arrays can hold only homoginious data elements,
		 3. 
		 
		 
		 */
		
	}
}
