package edu.evhen.cursova.controller.api;

import edu.evhen.cursova.controller.web.PersonWEBController;
import edu.evhen.cursova.model.Person;
import edu.evhen.cursova.model.Photocenter;
import edu.evhen.cursova.service.person.Impls.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("/{id}")
    Person getById(@PathVariable("id") String id) {
        return service.get(id);
    }


    @RequestMapping(value = "/create", method = RequestMethod.POST)
    Person create(@RequestBody Person person) {
        return service.save(person);
    }


    @RequestMapping("/delete/{id}")
    Person delete(@PathVariable("id") String id){
        return service.delete(id);
    }

}
