package edu.evhen.cursova.controller.web;

import edu.evhen.cursova.form.ClientForm;
import edu.evhen.cursova.form.PhotocenterForm;
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

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("clients", service.getAll());
        return "redirect:/web/client/list";
    }

    @RequestMapping(value = "create", method = RequestMethod.GET)
    String create(Model model){
        ClientForm clientForm = new ClientForm();
        model.addAttribute("clientForm", clientForm);
        return "clientAdd";
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("clientForm") ClientForm clientForm){
        Client client = new Client();
        client.setProfessional(clientForm.getProfessional());
        client.setAmateurs(clientForm.getAmateurs());
        client.setDiscountcard(clientForm.getDiscountcard());
        service.save(client);
        model.addAttribute("clients", service.getAll());
        return "redirect:/web/client/list";
    }

    @RequestMapping(value = "edit/{id}", method = RequestMethod.GET)
    String edit(Model model, @PathVariable("id") String id){
        Client client = service.get(id);
        ClientForm clientForm = new ClientForm();
        clientForm.setProfessional(client.getProfessional());
        clientForm.setAmateurs(client.getAmateurs());
        clientForm.setDiscountcard(client.getDiscountcard());
        model.addAttribute("clientForm", clientForm);
        return "clientAdd";
    }

    @RequestMapping(value = "edit/{id}", method = RequestMethod.POST)
    String edit(Model model,  @PathVariable("id") String id, @ModelAttribute("clientForm") ClientForm clientForm){
        Client client = new Client();
        client.setId(id);
        client.setProfessional(clientForm.getProfessional());
        client.setAmateurs(clientForm.getAmateurs());
        client.setDiscountcard(clientForm.getDiscountcard());
        service.save(client);
        model.addAttribute("clients", service.getAll());
        return "redirect:/web/client/list";
    }

}
