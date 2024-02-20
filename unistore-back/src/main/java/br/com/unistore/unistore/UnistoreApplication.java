package br.com.unistore.unistore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UnistoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnistoreApplication.class, args);
		System.out.println("Server is running...");
	}

}
