package com.xworkz.app.service;

import java.util.Optional;


import com.xworkz.app.dto.SnakeDTO;

public interface SnakeService {

	boolean validateAndSave(SnakeDTO dto);
	
	Optional<SnakeDTO> findById(int id);
}