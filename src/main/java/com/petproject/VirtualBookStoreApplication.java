package com.petproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*.*")
public class VirtualBookStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(VirtualBookStoreApplication.class, args);
	}

}
