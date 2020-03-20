package edu.evhen.cursova.controller.api;

import edu.evhen.cursova.model.Photocenter;
import edu.evhen.cursova.model.Photoshop;
import edu.evhen.cursova.service.photocenter.Impls.PhotocenterServiceImpl;
import edu.evhen.cursova.service.photoshop.Impls.PhotoshopServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/photoshop")
public class PhotoshopAPIController {
    @Autowired
    PhotoshopServiceImpl service;

    @RequestMapping("/list")
    List<Photoshop> getAll(){
        return service.getAll();
    }

    @RequestMapping("/{id}")
    Photoshop getById(@PathVariable("id") String id) {
        return service.get(id);
    }


    @RequestMapping(value = "/create", method = RequestMethod.POST)
    Photoshop create(@RequestBody Photoshop photoshop) {
        return service.save(photoshop);
    }


    @RequestMapping("/delete/{id}")
    Photoshop delete(@PathVariable("id") String id){
        return service.delete(id);
    }

}
