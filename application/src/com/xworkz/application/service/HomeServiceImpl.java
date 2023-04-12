package com.xworkz.application.service;

import com.xworkz.application.dto.HomeDTO;



import com.xworkz.application.exeception.InvalidDataHomeExeption;
import com.xworkz.application.repository.HomeRepository;

public class HomeServiceImpl implements HomeService{
	private HomeRepository repository;
	
	public HomeServiceImpl(HomeRepository repository) {
		this.repository=repository;     
	}

	@Override
	public boolean validateAndSave(HomeDTO dto)throws InvalidDataHomeExeption {
		if(dto!=null) {
			System.out.println("dto is not null, so we can validate..");
			
			int survey = dto.getSurveyNo();
			String location = dto.getLocation();
			
			boolean validSurvey = false;
			boolean validLocation =false;
			
			if(survey>0 && survey<100) {
				System.out.println("valid survey..");
				validSurvey=true;
			}else {
				System.err.println("invalid survey..");
			}
			
			if(location!=null && !location.isEmpty() && location.length()>3 && location.length()<30) {
				System.out.println("location is valid..");
				validLocation=true;
			}else {
				System.err.println("invalid Location..");
			}
			
			if(validSurvey && validLocation) {
				System.out.println("validation is done..so save..");
				boolean save = this.repository.save(dto);
				return save;
			}else {
				System.err.println("validation is not done..dont save..");
				throw new InvalidDataHomeExeption("data is invalid..");
				
			}
		}
		return false;
	}

}
