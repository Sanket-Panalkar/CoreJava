package com.xworkz.app.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.app.conf.MuseumConfiguration;
import com.xworkz.app.things.Museum;

public class SpringRunner {

	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(MuseumConfiguration.class);

		Museum museum = spring.getBean(Museum.class);

		System.out.println(museum);
	}
}
