package edu.evhen.cursova.controller.web;

import edu.evhen.cursova.service.person.Impls.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web/person")
public class PersonWEBController {
    @Autowired
    PersonServiceImpl service;

    @RequestMapping("/list")
    String getAll(Model model){
        model.addAttribute("persons", service.getAll());
        return "personList";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("persons", service.getAll());
        return "personList";
    }

}
