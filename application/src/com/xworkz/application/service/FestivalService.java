package com.xworkz.application.service;

import com.xworkz.application.dto.FestivalDTO;
import com.xworkz.application.exeception.InvalidFestivalException;

public interface FestivalService {

	boolean validateAndThenSave(FestivalDTO dto) throws InvalidFestivalException;
	
	default int count() {
		return 0;
		
	}
}
