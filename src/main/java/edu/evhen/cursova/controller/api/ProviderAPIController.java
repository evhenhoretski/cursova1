package edu.evhen.cursova.controller.api;

import edu.evhen.cursova.model.Provider;
import edu.evhen.cursova.service.provider.Impls.ProviderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/provider")
public class ProviderAPIController {
    @Autowired
    ProviderServiceImpl service;

    @RequestMapping("/list")
    List<Provider> getAll(){
        return service.getAll();
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id){
        service.delete(id);
        model.addAttribute("provider", service.getAll());
        return "providerList";
    }

}
