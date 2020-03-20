package edu.evhen.cursova.controller.api;

import edu.evhen.cursova.model.Client;
import edu.evhen.cursova.model.Photocenter;
import edu.evhen.cursova.service.client.Impls.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


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

    @RequestMapping("/{id}")
    Client getById(@PathVariable("id") String id) {
        return service.get(id);
    }


    @RequestMapping(value = "/create", method = RequestMethod.POST)
    Client create(@RequestBody Client client) {
        return service.save(client);
    }


    @RequestMapping("/delete/{id}")
    Client delete(@PathVariable("id") String id){
        return service.delete(id);
    }

}
