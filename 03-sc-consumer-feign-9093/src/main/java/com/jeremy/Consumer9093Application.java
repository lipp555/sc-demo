package com.jeremy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.jeremy.service")
@EnableEurekaClient
@SpringBootApplication
public class Consumer9093Application {

    public static void main(String[] args) {
        SpringApplication.run(Consumer9093Application.class, args);
    }

}
