package com.xworkz.application.service;

import com.xworkz.application.dto.AddressDTO;

public interface AddressService {

	boolean validateAndSave(AddressDTO dto);
}
