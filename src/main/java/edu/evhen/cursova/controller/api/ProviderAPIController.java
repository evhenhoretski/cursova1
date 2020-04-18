package edu.evhen.cursova.controller.api;

import edu.evhen.cursova.model.Booth;
import edu.evhen.cursova.model.Provider;
import edu.evhen.cursova.service.provider.Impls.ProviderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/provider")
public class ProviderAPIController {
    @Autowired
    ProviderServiceImpl service;

    @RequestMapping("/list")
    List<Provider> getAll() {
        return service.getAll();
    }

    @RequestMapping("/{id}")
    Provider getById(@PathVariable("id") String id) {
        return service.get(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    Provider create(@RequestBody Provider provider) {
        return service.save(provider);
    }

    @RequestMapping("/delete/{id}")
    Provider delete(@PathVariable("id") String id) {
        return service.delete(id);
    }

}
