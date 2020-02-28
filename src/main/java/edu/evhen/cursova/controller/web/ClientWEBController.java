package edu.evhen.cursova.controller.web;

import edu.evhen.cursova.service.client.Impls.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        return "clientList";
    }

}
