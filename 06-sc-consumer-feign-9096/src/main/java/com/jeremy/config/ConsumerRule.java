package com.jeremy.config;

import com.alibaba.fastjson.JSON;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.Server;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Random;

/**
 * @author jeremy.li
 * @date 2020/12/7
 * @description
 */
@Slf4j
public class ConsumerRule implements IRule {

    private ILoadBalancer iLoadBalancer;

    @Override
    public Server choose(Object object) {
        log.info("{}", JSON.toJSONString(object));
        List<Server> allServers = iLoadBalancer.getAllServers();
        if (allServers.size() < 1) {
            throw new RuntimeException("ILoadBalancer is null");
        }
        if (allServers.size() < 2) {
            return allServers.get(0);
        }
        int i = new Random().nextInt(allServers.size());
        return allServers.get(i);
    }

    @Override
    public void setLoadBalancer(ILoadBalancer iLoadBalancer) {
        this.iLoadBalancer = iLoadBalancer;
    }

    @Override
    public ILoadBalancer getLoadBalancer() {
        return iLoadBalancer;
    }
}
