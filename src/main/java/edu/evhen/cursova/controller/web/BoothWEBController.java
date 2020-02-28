package edu.evhen.cursova.controller.web;

import edu.evhen.cursova.service.booth.Impls.BoothServiceImpl;
import edu.evhen.cursova.service.photocenter.Impls.PhotocenterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web/booth")
public class BoothWEBController {
    @Autowired
    BoothServiceImpl service;

    @RequestMapping("/list")
    String getAll(Model model){
        model.addAttribute("booths", service.getAll());
        return "boothList";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("booths", service.getAll());
        return "boothList";
    }

}
