package edu.evhen.cursova.controller.web;

import edu.evhen.cursova.forms.PersonForm;
import edu.evhen.cursova.forms.PhotocenterForm;
import edu.evhen.cursova.forms.SearchForm;
import edu.evhen.cursova.model.Person;
import edu.evhen.cursova.model.Photocenter;
import edu.evhen.cursova.service.person.Impls.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String showAll(Model model) {
        List<Person> list = service.getAll();
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("persons", list);
        return "personList";
    }
    @PostMapping(value = "/list")
    public String search(Model model,
                         @ModelAttribute("searchForm") SearchForm searchForm) {
        String word = searchForm.getString();
        List<Person> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("persons", list);
        return "personList";
    }



    @RequestMapping(value = "/list/sorted", method = RequestMethod.GET)
    String sort(Model model){
        List<Person> list = service.sortByName();
        model.addAttribute("persons", list);
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        return "personList";
    }

    @RequestMapping(value = "/list/sorted", method = RequestMethod.POST)
    public String searchSorted(Model model,
                               @ModelAttribute("searchForm") SearchForm searchForm) {
        String word = searchForm.getString();
        List<Person> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("persons", list);
        return "personList";
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    String create(Model model) {
        PersonForm personForm = new PersonForm();
        model.addAttribute("personForm", personForm);
        return "personAdd";
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("personForm") PersonForm personForm) {
        Person person = new Person();
        person.setCard(personForm.getCard());
        person.setName(personForm.getName());
        person.setProfessional(personForm.getProfessional());
        service.save(person);
        model.addAttribute("persons", service.getAll());
        return "redirect:/web/person/list";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model, @PathVariable("id") String id) {
        Person person = service.get(id);
        PersonForm personForm = new PersonForm();
        personForm.setCard(person.getCard());
        personForm.setName(person.getName());
        personForm.setProfessional(person.getProfessional());
        model.addAttribute("personForm", personForm);
        return "personAdd";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model, @PathVariable("id") String id, @ModelAttribute("personForm") PersonForm personForm) {
        Person person = new Person();
        person.setId(id);
        person.setProfessional(personForm.getProfessional());
        person.setName(personForm.getName());
        person.setCard(personForm.getCard());
        service.save(person);
        model.addAttribute("persons", service.getAll());
        return "redirect:/web/person/list";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("persons", service.getAll());
        return "redirect:/web/person/list";
    }

}
