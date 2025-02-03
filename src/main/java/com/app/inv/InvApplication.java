package com.app.inv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.app.inv")
public class InvApplication {

    public static void main(String[] args) {
        SpringApplication.run(InvApplication.class, args);
    }

}
