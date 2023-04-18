package com.xworkz.app.service;

import java.util.Optional;

import com.xworkz.app.dto.HotelDTO;

public interface HotelService {

	boolean validateAndSave(HotelDTO dto);
	Optional<HotelDTO> findById(int id);
}
