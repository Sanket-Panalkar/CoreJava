package com.xworkz.app.boot;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.xworkz.app.conf.SpringConf;
import com.xworkz.app.things.Chair;
import com.xworkz.app.things.Saloon;
import com.xworkz.app.things.Scissor;
import com.xworkz.app.things.ShavingCream;

public class SpringRunner {

	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConf.class);
		System.out.println(spring.getBean(Saloon.class));
		Stream.of(spring.getBeanDefinitionNames()).forEach(e -> System.out.println(e));
		System.out.println(spring.getBeanDefinitionCount());

		System.out.println("==========================================================");

		System.out.println(spring.getBean(Scissor.class));
		Stream.of(spring.getBeanDefinitionNames()).forEach(e -> System.out.println(e));
		System.out.println(spring.getBeanDefinitionCount());

		System.out.println("==========================================================");

		System.out.println(spring.getBean(Chair.class));
		Stream.of(spring.getBeanDefinitionNames()).forEach(e -> System.out.println(e));
		System.out.println(spring.getBeanDefinitionCount());

		System.out.println("==========================================================");

		System.out.println(spring.getBean(ShavingCream.class));
		Stream.of(spring.getBeanDefinitionNames()).forEach(e -> System.out.println(e));
		System.out.println(spring.getBeanDefinitionCount());
	}
}
