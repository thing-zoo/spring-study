package com.example.level1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Level1Application {

    public static void main(String[] args) {
        SpringApplication.run(Level1Application.class, args);
    }

}
