package edu.evhen.cursova.controller.web;

import edu.evhen.cursova.service.provider.Impls.ProviderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web/provider")
public class ProviderWEBController {
    @Autowired
    ProviderServiceImpl service;

    @RequestMapping("/list")
    String getAll(Model model){
        model.addAttribute("providers", service.getAll());
        return "providerList";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("providers", service.getAll());
        return "providerList";
    }

}
