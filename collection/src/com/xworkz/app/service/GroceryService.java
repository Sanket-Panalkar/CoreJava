package com.xworkz.app.service;

import java.util.Optional;

import com.xworkz.app.dto.GroceryDTO;

public interface GroceryService {
	
	
	boolean validateAndSave(GroceryDTO dto);
	
	Optional<GroceryDTO> findById(int id);

	
}
