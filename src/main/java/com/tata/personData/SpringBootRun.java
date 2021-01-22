package com.tata.personData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.tata.personData")
@SpringBootApplication
public class SpringBootRun {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRun.class, args);
		System.out.println("Running...!");
	}

}
