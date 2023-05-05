package com.xworkz.task.service;

import java.util.Optional;

import com.xworkz.task.dto.LaptopDTO;

public interface LaptopService {

	boolean validateAndSave(LaptopDTO dto);
	
	Optional<LaptopDTO> findByName(String name);
	
}
