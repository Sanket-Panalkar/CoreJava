package com.xworkz.weapon.service;

import java.time.LocalDate;

import com.xworkz.weapon.constant.Type;
import com.xworkz.weapon.dto.WeaponDTO;

public class WeaponServiceImpl implements WeaponService {

	@Override
	public boolean validateAndThenSave(WeaponDTO dto) {
		System.out.println("Running validateAndThenSave...");

		if (dto != null) {
			System.out.println("dto is valid...");
			int id = dto.getId();
			String name = dto.getName();
			Type type = dto.getType();
			double cost = dto.getCost();
			String material = dto.getMaterial();
			String madeBy = dto.getMadeBy();
			String manufacturedBy = dto.getManufacturedBy();
			LocalDate manufacturedYear = dto.getManufacturedYear();
			String usedBy = dto.getUsedBy();
			double weight = dto.getWeaight();
			String usedFor = dto.getUsedFor();

			boolean validId = false;
			boolean validName = false;
			boolean validType = false;
			boolean validCost = false;
			boolean validMaterial = false;
			boolean validMadeBy = false;
			boolean validManufacturedBy = false;
			boolean validManufacturedYear = false;
			boolean validUsedBy = false;
			boolean validWeight = false;
			boolean validUsedFor = false;

			if (id > 0 && id < 100) {
				System.out.println("id is valid..");
				validId = true;
			} else {
				System.err.println("id is not valid..");
			}

			if (name != null && !name.isEmpty() && name.length() > 1 && name.length() < 100) {
				System.out.println("name is valid..");
				validName = true;
			} else {
				System.err.println("name is not valid..");
			}

			if (type != null) {
				System.out.println("type is valid..");
				validType = true;
			} else {
				System.err.println("invalid typed..");
			}

			if (cost > 0 && cost < 100000) {
				System.out.println("cost is valid..");
				validCost = true;
			} else {
				System.err.println("cost is invalid..");
			}

			if (material != null && !material.isEmpty() && material.length() > 3 && material.length() < 100) {
				System.out.println("material is valid..");
				validMaterial = true;
			} else {
				System.err.println("material is invalid..");
			}

			if (madeBy != null && !madeBy.isEmpty() && madeBy.length() > 3 && madeBy.length() < 100) {
				System.out.println("madeby is valid..");
				validMadeBy = true;
			} else {
				System.err.println("madeBy is invalid..");
			}

			if (manufacturedBy != null && !manufacturedBy.isEmpty() && manufacturedBy.length() > 3
					&& manufacturedBy.length() < 100) {
				System.out.println("manufacturedBy is valid..");
				validManufacturedBy = true;
			} else {
				System.err.println("manufacturedBy is invalid..");
			}

			LocalDate today = LocalDate.now();
			LocalDate startDate = LocalDate.of(2021, 01, 01);
			if (manufacturedYear != null && manufacturedYear.isEqual(today) && manufacturedYear.isAfter(startDate)) {
				System.out.println("manufacturedYear is valid..");
				validManufacturedYear = true;
			} else {
				System.err.println("manufacturedYear is invalid..");
			}

			if (usedBy != null && !usedBy.isEmpty() && usedBy.length() > 3 && usedBy.length() < 100) {
				System.out.println("usedBy is valid..");
				validUsedBy = true;
			} else {
				System.err.println("usedBy is invalid..");
			}

			if (weight > 0 && weight < 100) {
				System.out.println("weight is valid..");
				validWeight = true;
			} else {
				System.err.println("weight is invalid..");
			}

			if (usedFor != null && !usedFor.isEmpty() && usedFor.length() > 1 && usedFor.length() < 100) {
				System.out.println("usedFor is valid..");
				validUsedFor = true;
			} else {
				System.err.println("usedFor invalid..");
			}

			if (validId && validName && validType && validCost && validMaterial && validMadeBy && validManufacturedBy
					&& validManufacturedYear && validUsedBy && validWeight && validUsedFor) {
				System.out.println("validation is done and saved..");
				return true;
			} else {
				System.err.println("validation is not done..");
				return false;
			}

		} else {
			System.out.println("dto is not valid...");
		}

		return false;
	}

}
