package com.xworkz.application.service;

import com.xworkz.application.dto.ChocolateDTO;
import com.xworkz.application.exeception.InvalidDataChocolateExeption;
import com.xworkz.application.repository.ChocolateRepository;
import com.xworkz.application.util.ValidUtil;

public class ChocolateServiceImpl implements ChololateService {

	private ChocolateRepository repository;

	public ChocolateServiceImpl(ChocolateRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(ChocolateDTO dto) throws InvalidDataChocolateExeption {

		System.out.println("Running validateAndSave method in ChololateServiceImpl" + dto);

		if (dto != null) {

			System.out.println("dto is not null so we cal validate the properties...");

			// getting all properties....

			String brand = dto.getBrand();
			int price = dto.getPrice();
			double weight = dto.getWeight();

			boolean validBrand = false;
			boolean validPrice = false;
			boolean validWeight = false;

			// Validation
			if (ValidUtil.validString(brand)) {
				System.out.println("Brand is valid..");
				validBrand = true;
			} else {
				System.err.println("Brand is invalid..!");
			}

			// -----------------------------------------------------------------------

			if (ValidUtil.validInt(price)) {
				System.out.println("Price is valid..");
				validPrice = true;
			} else {
				System.err.println("Price is invalid..!");
			}

			// -----------------------------------------------------------------------

			if (ValidUtil.validDouble(weight)) {
				System.out.println("Weight is valid..");
				validWeight = true;
			} else {
				System.err.println("Weight is invalid..!");
			}

			// -----------------------------------------------------------------------

			if (ValidUtil.validFlag(validBrand, validPrice, validWeight)) {
				System.out.println("Validation is done and Saved...");
				if (!repository.isExist(dto)) {
					boolean save = this.repository.save(dto);
					return save;

				} else {
					System.err.println("dto is null so dont validate..!");
				}
			}
		}

		return false;
	}

}
