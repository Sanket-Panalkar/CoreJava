package com.xworkz.app.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.ToString;

@Component
@ToString
@AllArgsConstructor
public class Security {
	@Autowired
	private String name;
	
	@Autowired
	private Things things;
}
