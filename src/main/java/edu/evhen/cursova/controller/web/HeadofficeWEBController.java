package edu.evhen.cursova.controller.web;

import edu.evhen.cursova.service.headoffice.Impls.HeadofficeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/web/headoffice")
public class HeadofficeWEBController {
    @Autowired
    HeadofficeServiceImpl service;

    @RequestMapping("/list")
    String getAll(Model model){
        model.addAttribute("headoffices", service.getAll());
        return "headofficeList";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("headoffices", service.getAll());
        return "headofficeList";
    }

}
