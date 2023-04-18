package com.xworkz.app.service;

import java.util.Optional;


import com.xworkz.app.dto.SnakeDTO;
import com.xworkz.app.repository.SnakeRepository;

public class SnakeServiceImpl implements SnakeService{

	private SnakeRepository snakeRepository ;
	
	public SnakeServiceImpl(SnakeRepository snakeRepository) {
		this.snakeRepository=snakeRepository;
	}
	
	@Override
	public boolean validateAndSave(SnakeDTO dto) {
		
		if(dto!=null) {
			
			return this.snakeRepository.save(dto);
		} 
		
		return false;
	}

	@Override
	public Optional<SnakeDTO> findById(int id) {
		// TODO Auto-generated method stub
		return this.snakeRepository.findBYId(id);
	} 

}
