package com.jeremy.service;

import com.jeremy.dto.Depart;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author jeremy.li
 * @date 2020/12/4
 * @description
 */
@Service
@FeignClient(value="sc-provider")
@RequestMapping("/provider/depart")
public interface DepartService {

    @PostMapping("/save")
    boolean saveDepart(Depart depart);

    @DeleteMapping("/del/{id}")
    boolean removeDepartById(@PathVariable int id);

    @PutMapping("/update")
    boolean modifyDepart(Depart depart);

    @GetMapping("/get/{id}")
    Depart getDepartById(@PathVariable int id);

    @GetMapping("/list")
    List<Depart> listAllDeparts();
}
