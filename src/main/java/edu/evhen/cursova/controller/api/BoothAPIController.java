package edu.evhen.cursova.controller.api;

import edu.evhen.cursova.model.Booth;
import edu.evhen.cursova.service.booth.Impls.BoothServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/booth")
public class BoothAPIController {
    @Autowired
    BoothServiceImpl service;

    @RequestMapping("/list")
    List<Booth> getAll(){
        return service.getAll();
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id){
        service.delete(id);
        model.addAttribute("booth", service.getAll());
        return "boothList";
    }

}
