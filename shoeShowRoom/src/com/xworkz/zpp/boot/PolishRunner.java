package com.xworkz.zpp.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.zpp.conf.PolishConf;
import com.xworkz.zpp.conf.ShoeShowRoomConf;
import com.xworkz.zpp.dto.PolishDTO;
import com.xworkz.zpp.service.PolishService;

public class PolishRunner {

	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(ShoeShowRoomConf.class);
		PolishService data = spring.getBean(PolishService.class);

		PolishDTO dto1 = new PolishDTO("Brog", 150);
		System.out.println(dto1);

		boolean save1 = data.ValidateAndSave(dto1);
		System.out.println("saved :" + save1);
	}
}
