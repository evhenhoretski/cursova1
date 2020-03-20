package edu.evhen.cursova.controller.web;

import edu.evhen.cursova.form.PersonForm;
import edu.evhen.cursova.form.PhotocenterForm;
import edu.evhen.cursova.model.Person;
import edu.evhen.cursova.model.Photocenter;
import edu.evhen.cursova.service.person.Impls.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
        return "redirect:/web/person/list";
    }


    @RequestMapping(value = "/create", method = RequestMethod.GET)
    String create(Model model){
        PersonForm personForm = new PersonForm();
        model.addAttribute("personForm", personForm);
        return "personAdd";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("personForm") PersonForm personForm){
        Person person = new Person();
        person.setName(personForm.getName());
        person.setCard(personForm.getCard());
        person.setProfessional(personForm.getProfessional());
        service.save(person);
        model.addAttribute("persons", service.getAll());
        return "redirect:/web/person/list";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model, @PathVariable("id") String id){
        Person person = service.get(id);
        PersonForm personForm = new PersonForm();
        personForm.setName(person.getName());
        personForm.setCard(person.getCard());
        personForm.setProfessional(person.getProfessional());
        model.addAttribute("personForm", personForm);
        return "personAdd";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model,  @PathVariable("id") String id, @ModelAttribute("personForm") PersonForm personForm){
        Person person = new Person();
        person.setId(id);
        person.setName(personForm.getName());
        person.setCard(personForm.getCard());
        person.setProfessional(personForm.getProfessional());
        service.save(person);
        model.addAttribute("persons", service.getAll());
        return "redirect:/web/person/list";
    }

}
