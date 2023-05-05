package com.xworkz.application.service;

import com.xworkz.application.dto.ChocolateDTO;
import com.xworkz.application.exeception.InvalidDataChocolateExeption;

public interface ChololateService {

	default boolean validateAndSave(ChocolateDTO dto) throws InvalidDataChocolateExeption{
		return false;
	}
}
