package edu.evhen.cursova.controller.api;

import edu.evhen.cursova.model.Person;
import edu.evhen.cursova.service.person.Impls.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PersonAPIController {
    @Autowired
    PersonServiceImpl service;

    @RequestMapping("/list")
    List<Person> getAll(){
        return service.getAll();
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id){
        service.delete(id);
        model.addAttribute("person", service.getAll());
        return "personList";
    }

}
