package edu.evhen.cursova.controller.api;

import edu.evhen.cursova.model.Client;
import edu.evhen.cursova.service.client.Impls.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/client")
public class ClientAPIController {
    @Autowired
    ClientServiceImpl service;

    @RequestMapping("/list")
    List<Client> getAll(){
        return service.getAll();
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id){
        service.delete(id);
        model.addAttribute("client", service.getAll());
        return "clientList";
    }

}
