package edu.evhen.cursova.controller.api;

import edu.evhen.cursova.forms.PhotocenterForm;
import edu.evhen.cursova.model.Photocenter;
import edu.evhen.cursova.service.photocenter.Impls.PhotocenterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/photocenter")
public class PhotocenterAPIController {
    @Autowired
    PhotocenterServiceImpl service;

    @RequestMapping("/list")
    List<Photocenter> getAll() {
        return service.getAll();
    }

    @RequestMapping("/{id}")
    Photocenter getById(@PathVariable("id") String id) {
        return service.get(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    Photocenter create(@RequestBody Photocenter photocenter) {
        return service.save(photocenter);
    }

    @RequestMapping("/delete/{id}")
    Photocenter delete(@PathVariable("id") String id) {
        return service.delete(id);
    }

}
