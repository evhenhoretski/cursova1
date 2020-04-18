package edu.evhen.cursova.controller.web;

import edu.evhen.cursova.forms.ClientForm;
import edu.evhen.cursova.forms.PhotocenterForm;
import edu.evhen.cursova.forms.SearchForm;
import edu.evhen.cursova.model.Client;
import edu.evhen.cursova.model.Photocenter;
import edu.evhen.cursova.service.client.Impls.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/web/client")
public class ClientWEBController {
    @Autowired
    ClientServiceImpl service;

    @RequestMapping("/list")
    String getAll(Model model){
        model.addAttribute("clients", service.getAll());
        return "clientList";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String showAll(Model model) {
        List<Client> list = service.getAll();
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("clients", list);
        return "clientList";
    }
    @PostMapping(value = "/list")
    public String search(Model model,
                         @ModelAttribute("searchForm") SearchForm searchForm) {
        String word = searchForm.getString();
        List<Client> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("clients", list);
        return "clientList";
    }



    @RequestMapping(value = "/list/sorted", method = RequestMethod.GET)
    String sort(Model model){
        List<Client> list = service.sortByName();
        model.addAttribute("clients", list);
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        return "clientList";
    }

    @RequestMapping(value = "/list/sorted", method = RequestMethod.POST)
    public String searchSorted(Model model,
                               @ModelAttribute("searchForm") SearchForm searchForm) {
        String word = searchForm.getString();
        List<Client> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("clients", list);
        return "clientList";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    String create(Model model) {
        ClientForm clientForm = new ClientForm();
        model.addAttribute("clientForm", clientForm);
        return "clientAdd";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("photocenterForm") ClientForm clientForm) {
        Client client = new Client();
        client.setAmateurs(clientForm.getAmateurs());
        client.setDiscountcard(clientForm.getDiscountcard());
        client.setProfessional(clientForm.getProfessional());
        service.save(client);
        model.addAttribute("clients", service.getAll());
        return "redirect:/web/client/list";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model, @PathVariable("id") String id) {
        Client client = service.get(id);
        ClientForm clientForm = new ClientForm();
        clientForm.setAmateurs(client.getAmateurs());
        clientForm.setDiscountcard(client.getDiscountcard());
        clientForm.setProfessional(client.getProfessional());
        model.addAttribute("clientForm", clientForm);
        return "clientAdd";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model, @PathVariable("id") String id, @ModelAttribute("clientForm") ClientForm clientForm) {
        Client client = new Client();
        client.setId(id);
        client.setProfessional(clientForm.getProfessional());
        client.setDiscountcard(clientForm.getDiscountcard());
        client.setAmateurs(clientForm.getAmateurs());
        service.save(client);
        model.addAttribute("clients", service.getAll());
        return "redirect:/web/client/list";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("clients", service.getAll());
        return "redirect:/web/client/list";
    }

}
