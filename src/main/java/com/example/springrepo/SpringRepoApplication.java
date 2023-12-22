package com.example.springrepo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.springrepo.PorscheBaseAPI"})
public class SpringRepoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRepoApplication.class, args);
    }

}
