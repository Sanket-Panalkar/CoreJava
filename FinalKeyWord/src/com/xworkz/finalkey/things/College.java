package com.xworkz.finalkey.things;

public class College {

	public final char section= 'B';
	
	public final char getSection() {
		System.out.println("classRoom method in College..");
	    return section;
	}
	

	public static void main(String[] args) {
		College ref = new College();
		char sec = ref.getSection();
		System.out.println(sec);
	}
	
}