package com.pz.neptune;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NeptuneApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(NeptuneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
