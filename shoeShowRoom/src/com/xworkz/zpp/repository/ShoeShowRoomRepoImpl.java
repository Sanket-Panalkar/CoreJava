package com.xworkz.zpp.repository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.zpp.dto.ShoeShowRoomDTO;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class ShoeShowRoomRepoImpl implements ShoeShowRoomRepo {

	private Collection<ShoeShowRoomDTO> shoeShowRoomDTOs = new ArrayList<>();



	@Override
	public boolean save(ShoeShowRoomDTO dto) {
		return this.shoeShowRoomDTOs.add(dto);
	}

}
