package edu.evhen.cursova.controller.api;

import edu.evhen.cursova.model.Booth;
import edu.evhen.cursova.model.Headoffice;
import edu.evhen.cursova.service.headoffice.Impls.HeadofficeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/headoffice")
public class HeadofficeAPIController {
    @Autowired
    HeadofficeServiceImpl service;

    @RequestMapping("/list")
    List<Headoffice> getAll() {
        return service.getAll();
    }

    @RequestMapping("/{id}")
    Headoffice getById(@PathVariable("id") String id) {
        return service.get(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    Headoffice create(@RequestBody Headoffice headoffice) {
        return service.save(headoffice);
    }

    @RequestMapping("/delete/{id}")
    Headoffice delete(@PathVariable("id") String id) {
        return service.delete(id);
    }

}
