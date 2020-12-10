package com.jeremy.hystrix;

import com.jeremy.dto.Depart;
import com.jeremy.service.DepartService;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author jeremy.li
 * @date 2020/12/8
 * @description
 */
@Slf4j
@Component
public class DepartFallbackFactory implements FallbackFactory<DepartService> {
    @Override
    public DepartService create(Throwable throwable) {
        return new DepartService() {
            @Override
            public boolean saveDepart(Depart depart) {
                log.info("保存方法-服务降级");
                return false;
            }

            @Override
            public boolean removeDepartById(int id) {
                log.info("删除方法-服务降级");
                return false;
            }

            @Override
            public boolean modifyDepart(Depart depart) {
                log.info("修改方法-服务降级");
                return false;
            }

            @Override
            public Depart getDepartById(int id) {
                log.info("查询方法-服务降级");
                return null;
            }

            @Override
            public List<Depart> listAllDeparts() {
                log.info("查询列表方法-服务降级");
                return null;
            }
        };
    }
}
