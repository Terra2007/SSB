package com.ssp.springstagram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringstagramApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringstagramApplication.class, args);
    }

}
