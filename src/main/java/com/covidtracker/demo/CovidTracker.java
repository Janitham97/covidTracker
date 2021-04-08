package com.covidtracker.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CovidTracker {

    public static void main(String[] args) {
        SpringApplication.run(CovidTracker.class, args);
    }

}
