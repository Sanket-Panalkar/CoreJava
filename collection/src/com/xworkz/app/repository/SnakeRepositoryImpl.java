package com.xworkz.app.repository;

import java.util.ArrayList;

import java.util.Collection;
import java.util.Optional;

import com.xworkz.app.dto.SnakeDTO;

public class SnakeRepositoryImpl implements SnakeRepository {

	private Collection<SnakeDTO> snakeDTO = new ArrayList<SnakeDTO>();

	public SnakeRepositoryImpl() {
		System.out.println("No arg const");
	}

	public SnakeRepositoryImpl(Collection<SnakeDTO> snakeDTO) {
		super();
		this.snakeDTO = snakeDTO;
	}

	@Override
	public boolean save(SnakeDTO dto) {
		// TODO Auto-generated method stub
		return this.snakeDTO.add(dto);
	}

	@Override
	public Optional<SnakeDTO> findBYId(int id) {
		for(SnakeDTO dtoSnake:snakeDTO) {
			if(dtoSnake.getId()==id) {
				return Optional.of(dtoSnake);
			}
		}
		return Optional.empty();
	}

}