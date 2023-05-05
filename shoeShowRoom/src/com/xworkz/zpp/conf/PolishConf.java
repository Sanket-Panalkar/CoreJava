package com.xworkz.zpp.conf;

import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.xml.validation.Validator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.zpp")
public class PolishConf {

	public PolishConf() {
		System.out.println("Polish configuration running....");
	}

	@Bean
	public Validator validator() {
		System.out.println("registaring validator...");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = (Validator) factory.getValidator();
		return validator;

	}
}
