package edu.evhen.cursova.controller.api;

import edu.evhen.cursova.model.Headoffice;
import edu.evhen.cursova.service.headoffice.Impls.HeadofficeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/headoffice")
public class HeadofficeAPIController {
    @Autowired
    HeadofficeServiceImpl service;

    @RequestMapping("/list")
    List<Headoffice> getAll(){
        return service.getAll();
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id){
        service.delete(id);
        model.addAttribute("headoffice", service.getAll());
        return "headofficeList";
    }

}
