package com.xworkz.zpp.service;

import org.springframework.stereotype.Component;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import com.xworkz.zpp.dto.PolishDTO;
import com.xworkz.zpp.repository.PolishRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class PolishServiceImpl implements PolishService {

	private PolishRepository repo;
	private Validator validator;

	@Override
	public boolean ValidateAndSave(PolishDTO dto) {

		System.out.println("running validate and save method...");

		if (dto != null) {
			System.out.println("dto is not null..");
			Set<ConstraintViolation<PolishDTO>> constraintValidation = this.validator.validate(dto);
			System.out.println("total validartion :" + constraintValidation.size());
			if (!constraintValidation.isEmpty()) {
				constraintValidation.forEach(cv -> System.out.println(cv.getPropertyPath() + " " + cv.getMessage()));
				return false;
			} else {
				return this.repo.save(dto);
			}

		} else {
			System.out.println("dto is null..");
		}
		return false;
	}

}
