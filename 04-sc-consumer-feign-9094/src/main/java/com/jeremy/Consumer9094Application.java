package com.jeremy;

import com.jeremy.config.ConsumerRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@EnableFeignClients(basePackages = "com.jeremy.service")
@EnableEurekaClient
@SpringBootApplication
public class Consumer9094Application {

    public static void main(String[] args) {
        SpringApplication.run(Consumer9094Application.class, args);
    }

    @Bean
    public IRule loadBalanceRule() {
        return new ConsumerRule();
    }

}
