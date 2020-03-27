package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSbRestApplication {

	public FirstSbRestApplication() {
		System.out.println("FirstSbApplication INSTANCE created....");
	}
	public static void main(String[] args) {
		System.out.println("FirstSbApplication main() called..");
		SpringApplication.run(FirstSbRestApplication.class, args);
	}

}
