package edu.evhen.cursova.controller.web;

import edu.evhen.cursova.model.Photocenter;
import edu.evhen.cursova.service.photocenter.Impls.PhotocenterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/web/photocenter")
public class PhotocenterWEBController {
    @Autowired
    PhotocenterServiceImpl service;

    @RequestMapping("/list")
    String getAll(Model model){
        model.addAttribute("photocenters", service.getAll());
        return "photocenterList";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("photocenters", service.getAll());
        return "photocenterList";
    }

}
