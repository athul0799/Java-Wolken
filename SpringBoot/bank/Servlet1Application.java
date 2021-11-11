package com.example.serve;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.serve")
public class Servlet1Application {

	public static void main(String[] args) {
		SpringApplication.run(Servlet1Application.class, args);
		System.out.println("This is a servlet");
	}

}
