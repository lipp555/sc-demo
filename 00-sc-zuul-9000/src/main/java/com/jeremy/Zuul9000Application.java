package com.jeremy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class Zuul9000Application {

    public static void main(String[] args) {
        SpringApplication.run(Zuul9000Application.class, args);
    }

}
