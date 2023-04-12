package com.xworkz.app.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class ExamShedule {

	public static void main(String[] args) {
		
		Collection<String> examSchedule = new ArrayList<String>();
		examSchedule.add("monday");
		
		examSchedule.add("tuesday");
		examSchedule.add("saturday");
		examSchedule.add("sunday");
		examSchedule.add("tuesday");
		examSchedule.add(null);
		
		System.out.println("Whiskey size:"+examSchedule.size());
		
		System.out.println("For each loop===============================================");
		for(String loop:examSchedule) {
			if(Objects.nonNull(loop)) {
				System.out.println(loop);
			}
		}
		
		System.out.println(examSchedule);
		System.out.println("Whiskey  size :"+ examSchedule.size());
	}
		
		
	}

