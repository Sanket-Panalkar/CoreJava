package com.xworkz.task.service;

import java.util.Optional;

import com.xworkz.task.dto.LaptopDTO;
import com.xworkz.task.repository.LaptopRepository;

public class LaptopServiceImpl implements LaptopService {

	private LaptopRepository laptopRepository;

	public LaptopServiceImpl(LaptopRepository laptopRepository) {
		this.laptopRepository=laptopRepository;
	}

	@Override
	public boolean validateAndSave(LaptopDTO dto) {
		if (dto != null) {

			return this.laptopRepository.save(dto); 
			
		}
		return false;
	}

	@Override
	public Optional<LaptopDTO> findByName(String name) {

		return laptopRepository.findByName(name);
	}

}