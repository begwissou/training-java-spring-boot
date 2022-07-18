package com.camara.demodatajpa;

import com.camara.demodatajpa.config.ApplicationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({ ApplicationProperties.class })
public class DemodatajpaApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemodatajpaApplication.class, args);
  }
}
