package com.example.springrepo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling // To enable Scheduling package
@ComponentScan(basePackages = {"com.example.springrepo.Scheduling"})
public class SpringRepoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRepoApplication.class, args);
    }

}
