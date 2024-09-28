package com.app;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

@Configuration
@RestController
@SpringBootApplication
@RequiredArgsConstructor
public class SpringFlywayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFlywayApplication.class, args);
	}

}
