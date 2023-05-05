package com.xworkz.zpp.conf;

import javax.validation.Validation;

import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.zpp")
public class ShoeShowRoomConf {

	public ShoeShowRoomConf() {
		System.out.println("no arg Config...");

	}

	@Bean
	public Validator validator() {
		System.out.println("registaring validator..");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

		javax.validation.Validator validator = factory.getValidator();
		return validator;
	}
}
