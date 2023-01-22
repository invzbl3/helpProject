package com.example.helpproject.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author invzbl3 on 1/21/2023
 * @project helpProject
 */
@EnableJpaRepositories
@SpringBootApplication
@EnableWebMvc
//@ComponentScan("com.example.helpproject")
public class SpringBootAdvancedApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootAdvancedApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdvancedApplication.class, args);
    }
}