package com.springfordocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringForDockerApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringForDockerApplication.class, args);
        System.out.println("Done");
    }

}
