package com.xworkz.application.service;

import com.xworkz.application.dto.HomeDTO;

import com.xworkz.application.exeception.InvalidDataHomeExeption;

public interface HomeService {

	boolean validateAndSave(HomeDTO dto)throws InvalidDataHomeExeption;
}
