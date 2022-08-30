package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.demo")

public class CrudDemoApplication {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(CrudDemoApplication.class, args);
		System.out.println("Server up");

	}


}
