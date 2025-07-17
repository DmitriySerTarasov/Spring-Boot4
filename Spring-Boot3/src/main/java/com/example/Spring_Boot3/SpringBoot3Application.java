package com.example.Spring_Boot3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBoot3Application {

    public static void main(String[] args) {

        SpringApplication.run(SpringBoot3Application.class, args);
    }
    @GetMapping("/")
    private String hello() {
        return "Hello from app!";
    }

}
