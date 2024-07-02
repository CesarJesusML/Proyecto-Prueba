package com.cibertec.gestrestaurante;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity 
public class GestrestauranteApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestrestauranteApplication.class, args);
	}

}
