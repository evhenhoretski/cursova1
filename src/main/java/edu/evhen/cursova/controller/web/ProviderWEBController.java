package edu.evhen.cursova.controller.web;

import edu.evhen.cursova.form.PhotocenterForm;
import edu.evhen.cursova.form.ProviderForm;
import edu.evhen.cursova.model.Photocenter;
import edu.evhen.cursova.model.Provider;
import edu.evhen.cursova.service.provider.Impls.ProviderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
        return "redirect:/web/provider/list";
    }

    @RequestMapping(value = "create", method = RequestMethod.GET)
    String create(Model model){
        ProviderForm providerForm = new ProviderForm();
        model.addAttribute("providerForm", providerForm);
        return "providerAdd";
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("providerForm") ProviderForm providerForm){
        Provider provider = new Provider();
        provider.setName(providerForm.getName());
        provider.setPaper(providerForm.getPaper());
        provider.setFilm(providerForm.getFilm());
        provider.setPaint(providerForm.getPaint());
        service.save(provider);
        model.addAttribute("providers", service.getAll());
        return "redirect:/web/provider/list";
    }

    @RequestMapping(value = "edit/{id}", method = RequestMethod.GET)
    String edit(Model model, @PathVariable("id") String id){
        Provider provider = service.get(id);
        ProviderForm providerForm = new ProviderForm();
        providerForm.setName(provider.getName());
        providerForm.setPaper(provider.getPaper());
        providerForm.setFilm(provider.getFilm());
        providerForm.setPaint(provider.getPaint());
        model.addAttribute("providerForm", providerForm);
        return "providerAdd";
    }

    @RequestMapping(value = "edit/{id}", method = RequestMethod.POST)
    String edit(Model model,  @PathVariable("id") String id, @ModelAttribute("photocenterForm") ProviderForm providerForm){
        Provider provider = new Provider();
        provider.setId(id);
        provider.setName(providerForm.getName());
        provider.setPaper(providerForm.getPaper());
        provider.setFilm(providerForm.getFilm());
        provider.setPaint(providerForm.getPaint());
        service.save(provider);
        model.addAttribute("providers", service.getAll());
        return "redirect:/web/provider/list";
    }

}
