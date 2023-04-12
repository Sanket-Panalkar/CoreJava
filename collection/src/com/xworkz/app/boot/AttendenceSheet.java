package com.xworkz.app.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class AttendenceSheet {
	public static void main(String[] args) {
		Collection<String> attendenceSheet=new ArrayList<String>();
		attendenceSheet.add("Annesh");
		attendenceSheet.add("Sanket");
		attendenceSheet.add("Priyanka");
		attendenceSheet.add("Kavan");
		attendenceSheet.add("Raju");
		attendenceSheet.add("Vinayak");
		attendenceSheet.add("Maruti");
		attendenceSheet.add("Shivu");
		attendenceSheet.add("Dinakar");
		attendenceSheet.add("Jayanth");
		attendenceSheet.add(null);
		System.out.println("attendenceSheet size:"+attendenceSheet.size());
		
		System.out.println("For each loop===============================================");
		for(String loop:attendenceSheet) {
			if(Objects.nonNull(loop)) {
				System.out.println(loop);
			}
		}
		System.out.println("Using Iterator==================================");
		Iterator<String> sheet=attendenceSheet.iterator();
		while(sheet.hasNext()) {
			String obj=sheet.next();
			if(Objects.isNull(obj)) {
				sheet.remove();
			}
		}
		System.out.println(attendenceSheet);
		System.out.println("Attendence sheet size:"+attendenceSheet.size());
	}
}
