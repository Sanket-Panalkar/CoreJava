package com.xworkz.application.service;

import com.xworkz.application.dto.AddressDTO;

public class AddressServiceImpl implements AddressService {

	@Override
	public boolean validateAndSave(AddressDTO dto) {
		System.out.println("Running AddressServiceImpl.." + dto);

		if (dto != null) {
			System.out.println("dto is not null, we can vallidate the properties...");

			String street = dto.getStreet();
			String area = dto.getArea();
			int pincode = dto.getPincode();
			int floor = dto.getFloor();
			String number = dto.getNumber();
			String city = dto.getCity();
			String state = dto.getState();
			
			boolean validStreet = false;
			boolean validArea = false;
			boolean validPincode = false;
			boolean validFlore = false;
			boolean validNumber = false;
			boolean validCity = false;
			boolean validState = false;
			
			
		}

		return false;
	}

}
