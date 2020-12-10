package com.jeremy.config;

import com.netflix.loadbalancer.IRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jeremy.li
 * @date 2020/12/2
 * @description
 */
@Configuration
public class Config {

    @LoadBalanced    // 开启消息者端的负载均衡功能，默认是轮询策略
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


//    @Bean
//    public IRule loadBalanceRule(){
//        return new ConsumerRule();
//    }

//    @Bean
//    public IRule loadBalanceRule() {
//        // 指定要排除的Server的端口号
//        List<Integer> ports = new ArrayList<>();
//        ports.add(8082);
//        return new CustomRule(ports);
//    }
}
