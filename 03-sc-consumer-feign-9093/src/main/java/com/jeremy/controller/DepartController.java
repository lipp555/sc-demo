package com.jeremy.controller;

import com.jeremy.dto.Depart;
import com.jeremy.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * jeremy.li
 */
@RequestMapping("/consumer/depart")
@RestController
public class DepartController {


    @Autowired
    private DepartService departService;


    @PostMapping("/save")
    public boolean saveHandle(@RequestBody Depart depart) {
        depart.setDbase("test");
        return departService.saveDepart(depart);
    }

    @DeleteMapping("/del/{id}")
    public void deleteHandle(@PathVariable("id") int id) {
        departService.removeDepartById(id);
    }

    @PutMapping("/update")
    public void updateHandle(@RequestBody Depart depart) {
        departService.modifyDepart(depart);
    }

    @GetMapping("/get/{id}")
    public Depart getHandle(@PathVariable("id") int id) {
        return departService.getDepartById(id);
    }

    @GetMapping("/list")
    public List<Depart> listHandle() {
        return departService.listAllDeparts();
    }
}
