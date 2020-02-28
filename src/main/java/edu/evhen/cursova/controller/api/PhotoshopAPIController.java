package edu.evhen.cursova.controller.api;

import edu.evhen.cursova.model.Photoshop;
import edu.evhen.cursova.service.photocenter.Impls.PhotocenterServiceImpl;
import edu.evhen.cursova.service.photoshop.Impls.PhotoshopServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id){
        service.delete(id);
        model.addAttribute("photoshop", service.getAll());
        return "photoshopList";
    }

}
