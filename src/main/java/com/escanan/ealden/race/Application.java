package com.escanan.ealden.race;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        Configurations.raceService().newRace();

        SpringApplication.run(Application.class, args);
    }
}
