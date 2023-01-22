package com.example.helpproject.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author invzbl3 on 1/21/2023
 * @project helpProject
 */
@EnableJpaRepositories
@SpringBootApplication
@EnableWebMvc
public class SpringBootAdvancedApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdvancedApplication.class, args);
    }
}