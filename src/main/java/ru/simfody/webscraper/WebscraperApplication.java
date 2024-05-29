package ru.simfody.webscraper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class WebscraperApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebscraperApplication.class, args);
    }

}
