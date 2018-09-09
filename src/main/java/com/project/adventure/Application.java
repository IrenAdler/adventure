package com.project.adventure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.project.adventure.repository")

public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}