package com.xworkz.string.things;

import java.util.Scanner;

public class CountWord {

	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		
		Scanner sc = new Scanner(System.in);
		String value = sc.nextLine();
		int count = 1;
		
		for(int i=0; i<value.length()-1; i++) {
			if((value.charAt(i)==' ')&&(value.charAt(i+1)!=' ')){
				count ++;
			}
					
		}
		System.out.println("number of words : "+count);
	}
}
