package com.xworkz.task.repository;

import java.util.Optional;

import com.xworkz.task.dto.LaptopDTO;

public interface LaptopRepository {

	boolean save(LaptopDTO dto);

	Optional<LaptopDTO> findByName(String name);
}
