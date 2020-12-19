package com.example.demo;

import java.util.ArrayList;

import org.bson.Document;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.baeldung.dependency.exception"})
public class DeliNetApplication {
	public static void main(String[] args) {
		SpringApplication.run(DeliNetApplication.class, args);
	}
}
