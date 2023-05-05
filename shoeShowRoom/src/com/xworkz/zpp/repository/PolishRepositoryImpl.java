package com.xworkz.zpp.repository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.zpp.dto.PolishDTO;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class PolishRepositoryImpl implements PolishRepository {

	private Collection<PolishDTO> polishDTOs = new ArrayList<>();

	@Override
	public boolean save(PolishDTO dto) {


		return this.polishDTOs.add(dto);
	}

}
