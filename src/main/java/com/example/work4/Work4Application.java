package com.example.work4;

import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class Work4Application {

    @Bean
    public CommandLineRunner initDB(StudentsRepository repo) {
        return args -> {
            Faker faker = new Faker();
            for (int i = 1; i <= 100; i++) {
                repo.save(new Students(i, faker.name().firstName(), faker.internet().password(), UUID.randomUUID().toString()));
            }
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(Work4Application.class, args);
    }

}
