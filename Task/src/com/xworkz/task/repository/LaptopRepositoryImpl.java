package com.xworkz.task.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import com.xworkz.task.dto.LaptopDTO;

public class LaptopRepositoryImpl implements LaptopRepository {

	private Collection<LaptopDTO> laptopDTO = new ArrayList<LaptopDTO>();

	public LaptopRepositoryImpl() {
		System.out.println("NO - arg constructor of LaptopServiceImpl");
	}

	public LaptopRepositoryImpl(Collection<LaptopDTO> laptopDTO) {
		super();
		this.laptopDTO = laptopDTO;
	}

	@Override
	public boolean save(LaptopDTO dto) {
		// TODO Auto-generated method stub
		return this.laptopDTO.add(dto);
	}

	@Override
	public Optional<LaptopDTO> findByName(String name) {
	
		return this.laptopDTO.stream().filter(e->e.getName().equalsIgnoreCase(name)).findAny();
	}
}
