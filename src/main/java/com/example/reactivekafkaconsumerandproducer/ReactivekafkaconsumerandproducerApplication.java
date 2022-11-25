package com.example.reactivekafkaconsumerandproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = { "com.example.reactivekafkaconsumerandproducer.*"})
@ComponentScan(basePackages = "com.example.reactivekafkaconsumerandproducer.*")
public class ReactivekafkaconsumerandproducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactivekafkaconsumerandproducerApplication.class, args);
	}

}