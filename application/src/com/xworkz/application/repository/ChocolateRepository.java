package com.xworkz.application.repository;

import com.xworkz.application.dto.ChocolateDTO;
import com.xworkz.application.exeception.InvalidDataChocolateExeption;

public interface ChocolateRepository {

	boolean save(ChocolateDTO dto) throws InvalidDataChocolateExeption;

	default boolean isExist(ChocolateDTO dto) {
		return false;

	}

	default boolean validateAndSave(ChocolateDTO dto) throws InvalidDataChocolateExeption{
		return false;

	}

	default ChocolateDTO findBybrand(String brand) throws InvalidDataChocolateExeption{

		return null;

	}

	default ChocolateDTO findByBrandAndPrice(String brand, int price) throws InvalidDataChocolateExeption{
		return null;

	}
	
	default ChocolateDTO[] findByBrandAndPriceAndWeight(String brand, int price, double weight) throws InvalidDataChocolateExeption{
		return null;
		
	}
	
	default ChocolateDTO[] findByBrandOrPriceOrWeight(String brand, int price, double weight) throws InvalidDataChocolateExeption{
		return null;
		
	}

}
