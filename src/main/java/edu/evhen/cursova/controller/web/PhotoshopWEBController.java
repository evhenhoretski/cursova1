package edu.evhen.cursova.controller.web;

import edu.evhen.cursova.service.photocenter.Impls.PhotocenterServiceImpl;
import edu.evhen.cursova.service.photoshop.Impls.PhotoshopServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web/photoshop")
public class PhotoshopWEBController {
    @Autowired
    PhotoshopServiceImpl service;

    @RequestMapping("/list")
    String getAll(Model model){
        model.addAttribute("photoshops", service.getAll());
        return "photoshopList";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("photoshops", service.getAll());
        return "photoshopList";
    }

}
