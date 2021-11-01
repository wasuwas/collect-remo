package dev.wasuwasu.remo.collect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class CollectRemoDataApplication {

	public static void main(final String[] args) {
		SpringApplication.run(CollectRemoDataApplication.class, args);
	}

}
