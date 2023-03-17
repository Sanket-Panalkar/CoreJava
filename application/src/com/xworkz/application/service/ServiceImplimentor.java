package com.xworkz.application.service;

import java.awt.Window.Type;
import java.time.LocalDate;

import com.xworkz.application.dto.service.ApplicationService;
import com.xworkz.application.dto.things.Application;
import com.xworkz.application.dto.things.Language;
import com.xworkz.application.dto.things.Os;

public class ServiceImplimentor implements ApplicationService{

	@Override
	public boolean validateAndSave(Application dto) {
		System.out.println(" Running validateAndSave "+ dto);
		
		if(dto!=null) {
			System.out.println("dto is not null, we can validate the properties..");
		}
		       String name = dto.getName();
		       double version =  dto.getVersion();
		       LocalDate date = dto.getCreatedDate();
		       double size = dto.getSize();
		       String  developedBy = dto.getDevelopedBy();
		       com.xworkz.application.dto.things.Type type = dto.getType();
		       double price = dto.getPrice();
		       LocalDate firstDate = dto.getFirstVersionReleaseDate();
		       LocalDate currentDate = dto.getCurrentVersionReleaseDate();
		       LocalDate nextDate = dto.getNextVersionReleaseDate();
		       int trialDays = dto.getTrialDays();
		       Language lang = dto.getLang();
		       int processor = dto.getMinProcessorSpeed();
		       int ram = dto.getMinRamSpeedRequired();
		       boolean internet = dto.isInternetNeeded();
		       int ageLimit = dto.getAgeLimit();
		       int download = dto.getNoOfDownloads();
		       char rating = dto.getRating();
		       Os os = dto.getOsTypeSupported();
		       
		       if(name!=null && !name.isEmpty() && name.length() > 3 && name.length()<30 ) {
		    	   System.out.println("Name is Valid..");
		       }
		       else {
		    	   System.err.println("Name is Not Valid..");
		       }
		       if(version > 0 && version < 100) {
		    	   System.out.println("Version is valid..");
		       }
		       else {
		    	   System.err.println("Version is not valid..");
		       }
		       if(date!=null) {
		    	   System.out.println("date is valid..");
		       }
		       else {
		    	   System.out.println("date is not valid..");
		       }
		       if(size > 0 && size < 100) {
		    	   System.out.println("size is valid..");
		       }
		       else {
		    	   System.out.println("size is not valod..");
		       }
		       if(developedBy!=null && !developedBy.isEmpty() && developedBy.length() > 3 && developedBy.length()<30 ) {
		    	   System.out.println("developedBy is valid..");
		       }
		       else {
		    	   System.out.println("developedBy is not valid..");
		       }
		       if(type!=null) {
		    	   System.out.println("type is valid..");
		       }
		       else {
		    	   System.out.println("type is not valid..");
		       }
		       if(price > 0 && price < 100) {
		    	   System.out.println("price is valid..");
		       }
		       else {
		    	   System.out.println("price is not valid..");
		       }
		       if(firstDate!=null) {
		    	   System.out.println("first date is valid..");
		       }
		       else {
		    	   System.out.println("first date is not valid..");
		       }
		       if(currentDate!=null) {
		    	   System.out.println("current date is valid..");
		       }
		       else {
		    	   System.out.println("current date is not valid..");
		       }
		       if(nextDate!=null) {
		    	   System.out.println("nnextDate is valid..");
		       }
		       else {
		    	   System.out.println("nextDate is invalid..");
		       }
		       if(trialDays < 0 && trialDays < 100) {
		    	   System.out.println("trialDays is valid..");
		       }
		       else {
		    	   System.out.println("trialDays is invalid");
		       }
		       if(lang!=null) {
		    	   System.out.println("lang is valid..");
		       }
		       else {
		    	   System.out.println("lang is invalid..");
		       }
		       if(processor > 0 && processor < 100) {
		    	   System.out.println("processor is vaild..");
		       }
		       else {
		    	   System.out.println("processor is not valid..");
		       }
		       if(ram > 0 && ram < 100) {
		    	   System.out.println("ram is valid..");
		       }
		       else {
		    	   System.out.println("ram is in valid..");
		       }
//		       if(internet > 0 && internet < 100) {
//		         
//		       }
		return false;
	}
	

}
