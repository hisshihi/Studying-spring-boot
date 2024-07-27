package com.hissDev.studying_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StudyingSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StudyingSpringBootApplication.class, args);

//		Получаем бин(зависимость) из контейнера Spring boot
		Dev dev = context.getBean(Dev.class);

		dev.build();
	}

}
