package com.jeremy.controller;

import com.jeremy.constant.Constant;
import com.jeremy.dto.Depart;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;

/**
 * jeremy.li
 */
@RequestMapping("/consumer/depart")
@RestController
public class DepartController {


    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/save")
    public boolean saveHandle(@RequestBody Depart depart) {
        depart.setDbase("test");
        String url = Constant.PROVIDER_SERVICE_URL + "/provider/depart/save";
        return restTemplate.postForObject(url, depart, Boolean.class);
    }

    @DeleteMapping("/del/{id}")
    public void deleteHandle(@PathVariable("id") int id) {
        String url = Constant.PROVIDER_SERVICE_URL + "/provider/depart/del/" + id;
        restTemplate.delete(url);
    }

    @PutMapping("/update")
    public void updateHandle(@RequestBody Depart depart) {
        depart.setDbase("test");
        String url = Constant.PROVIDER_SERVICE_URL + "/provider/depart/update";
        restTemplate.put(url, depart);
    }

    @HystrixCommand(fallbackMethod = "getHandleHystrix")
    @GetMapping("/get/{id}")
    public Depart getHandle(@PathVariable("id") int id) {
        String url = Constant.PROVIDER_SERVICE_URL + "/provider/depart/get/" + id;
        Depart depart = restTemplate.getForObject(url, Depart.class);
        if (Objects.isNull(depart)){
            throw new RuntimeException("depart is null");
        }
        return depart;
    }

    @GetMapping("/list")
    public List<Depart> listHandle() {
        String url = Constant.PROVIDER_SERVICE_URL + "/provider/depart/list";
        return restTemplate.getForObject(url, List.class);
    }

    public Depart getHandleHystrix(@PathVariable("id") int id) {
        Depart depart = new Depart();
        depart.setId(id);
        depart.setDbase("");
        depart.setName("Hystrix");
        return depart;
    }
}
