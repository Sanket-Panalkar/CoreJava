package com.xworkz.zpp.boot;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.zpp.conf.ShoeShowRoomConf;
import com.xworkz.zpp.dto.ShoeShowRoomDTO;
import com.xworkz.zpp.service.shoeShowRoomService;

public class ShoeShowRoomRunner {

	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(ShoeShowRoomConf.class);

		shoeShowRoomService ref = spring.getBean(shoeShowRoomService.class);

		ShoeShowRoomDTO dto1 = new ShoeShowRoomDTO(654, "sanket", "rajajinagar", "asdu8458746");
		System.out.println(dto1);
		boolean save1 = ref.ValidateAndSave(dto1);
		System.out.println("saved :" + save1);

	}
}
