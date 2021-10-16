package com.richu.example.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyprojectApplication {

	public int add(int a, int b)
	{
		return a+b;
	}
	
	public int prod(int a, int b)
	{
		return a*b;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MyprojectApplication.class, args);
	}

}
