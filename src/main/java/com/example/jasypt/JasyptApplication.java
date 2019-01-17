package com.example.jasypt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JasyptApplication {

  public static void main(String[] args) {
    System.setProperty("jasypt.encryptor.password", System.getenv("JASYPT_PASSWORD"));

    SpringApplication.run(JasyptApplication.class, args);
  }

}

