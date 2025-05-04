package com.example.SpringForJenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringForJenkinsApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SpringForJenkinsApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringForJenkinsApplication.class);
    }

    @GetMapping("/hello")
    public String firstApp(@RequestParam(value = "name", defaultValue = "Coder") String name) {
        return String.format("Congratulations  %s, you've built your first Spring Boot Application from Scratch!!", name);
    }
}
