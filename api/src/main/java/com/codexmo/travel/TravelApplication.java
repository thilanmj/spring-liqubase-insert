package com.codexmo.travel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class TravelApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelApplication.class, args);
	}
}
