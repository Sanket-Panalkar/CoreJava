package com.xworkz.application.repository;

import com.xworkz.application.dto.DesertDTO;

public interface DesertRepository {    
	boolean save(DesertDTO dto);

	default boolean isExist(DesertDTO dto) {
		return false;
	}

	default DesertDTO find(DesertDTO dto) {
		return null;

	}

	default DesertDTO findByName(String name) {
		return null;

	}

	default String findAreaByName(String name) {
		return null;
		

	}

	default DesertDTO findByNameAndCountryAndArea(String name, String country, String area) {
		return null;

	}
	default int total() {
		return 0;
	}
}