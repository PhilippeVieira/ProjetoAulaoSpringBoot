package org.example.projetoaulaospringboot.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages = {"org.example"})
public class ProjetoAulaoSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProjetoAulaoSpringBootApplication.class, args);
    }

}
