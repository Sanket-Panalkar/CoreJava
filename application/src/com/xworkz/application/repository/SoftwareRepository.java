package com.xworkz.application.repository;

import com.xworkz.application.dto.FestivalDTO;
import com.xworkz.application.dto.SoftwareDTO;

public interface SoftwareRepository {

	public boolean save(SoftwareDTO repo);

	default boolean isExist(SoftwareDTO dto) {
		return false;
	}

	default boolean totalSaved() {
		return false;
	}

	default SoftwareDTO findById(int id) {
		return null;
	}

	default SoftwareDTO findBYName(String name) {

		return null;
	}

	default SoftwareDTO findBYNameAndId(String name, int id) {
		return null;
	}

}