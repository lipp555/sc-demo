package com.jeremy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author jeremy.li
 * @date 2020/12/2
 * @description
 */
@Configuration
public class Config {

    //@LoadBalanced    // 开启消息者端的负载均衡功能，默认是轮询策略
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
