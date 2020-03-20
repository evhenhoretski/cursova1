package edu.evhen.cursova.controller.api;

import edu.evhen.cursova.model.Booth;
import edu.evhen.cursova.model.Photocenter;
import edu.evhen.cursova.service.booth.Impls.BoothServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/booth")
public class BoothAPIController {
    //
    @Autowired
    BoothServiceImpl service;

    @RequestMapping("/list")
    List<Booth> getAll(){
        return service.getAll();
    }

    @RequestMapping("/{id}")
    Booth getById(@PathVariable("id") String id) {
        return service.get(id);
    }


    @RequestMapping(value = "/create", method = RequestMethod.POST)
    Booth create(@RequestBody Booth booth) {
        return service.save(booth);
    }


    @RequestMapping("/delete/{id}")
    Booth delete(@PathVariable("id") String id){
        return service.delete(id);
    }

}
