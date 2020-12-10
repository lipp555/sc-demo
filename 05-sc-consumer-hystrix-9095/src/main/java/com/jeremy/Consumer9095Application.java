package com.jeremy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableCircuitBreaker
@EnableEurekaClient
@SpringBootApplication
public class Consumer9095Application {

    public static void main(String[] args) {
        SpringApplication.run(Consumer9095Application.class, args);
    }

}
