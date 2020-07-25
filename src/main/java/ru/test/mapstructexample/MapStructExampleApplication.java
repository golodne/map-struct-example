package ru.test.mapstructexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
public class MapStructExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MapStructExampleApplication.class, args);
	}

}
