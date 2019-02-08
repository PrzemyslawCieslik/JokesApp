package com.example.przemyslawcieslik.ChuckNorrisJokeApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:templates/chuckConfig.xml")
public class ChuckNorrisJokeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChuckNorrisJokeAppApplication.class, args);
	}


}

