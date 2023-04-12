package com.xworkz.application.service;

import com.xworkz.application.dto.DesertDTO;
import com.xworkz.application.exeception.*;

public interface DesertService {
	boolean validateAndThenSave(DesertDTO dto) throws InvalidDataDesertException;

	default DesertDTO find(DesertDTO dto) throws InvalidDataDesertException {
		return null;

	}

	default DesertDTO findByName(String name) throws InvalidDataDesertException {
		return null;

	}

	default String findAreaByName(String name) throws InvalidDataDesertException {
		return null;

	}

	default DesertDTO findByNameAndCountryAndArea(String name, String country, String area)
			throws InvalidDataDesertException {
		return null;

	}

	default int getTotal() {
		return 0;
	}
}