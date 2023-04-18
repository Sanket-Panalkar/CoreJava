package com.xworkz.app.repository;

import java.util.Optional;

import com.xworkz.app.dto.SnakeDTO;

public interface SnakeRepository {

	boolean save(SnakeDTO dto);

	Optional<SnakeDTO> findBYId(int id);

}
