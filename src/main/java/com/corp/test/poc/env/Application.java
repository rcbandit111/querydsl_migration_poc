package com.corp.test.poc.env;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({ "com.corp.test.poc.env" })
@EntityScan({ "com.corp.test.poc.env.domain" })
@EnableJpaRepositories({ "com.corp.test.poc.env.repository" })
public class Application {

    public static void main(final String[] args)
    {
        SpringApplication.run(Application.class, args);
    }
}
