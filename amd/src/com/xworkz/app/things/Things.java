package com.xworkz.app.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Things {
	
	@Autowired
	private String type;
	
}
