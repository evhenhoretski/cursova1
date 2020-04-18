package edu.evhen.cursova.controller.web;

import edu.evhen.cursova.forms.PhotocenterForm;
import edu.evhen.cursova.forms.ProviderForm;
import edu.evhen.cursova.forms.SearchForm;
import edu.evhen.cursova.model.Photocenter;
import edu.evhen.cursova.model.Provider;
import edu.evhen.cursova.service.provider.Impls.ProviderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String showAll(Model model) {
        List<Provider> list = service.getAll();
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("providers", list);
        return "providerList";
    }
    @PostMapping(value = "/list")
    public String search(Model model,
                         @ModelAttribute("searchForm") SearchForm searchForm) {
        String word = searchForm.getString();
        List<Provider> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("providers", list);
        return "providerList";
    }



    @RequestMapping(value = "/list/sorted", method = RequestMethod.GET)
    String sort(Model model){
        List<Provider> list = service.sortByName();
        model.addAttribute("providers", list);
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        return "providerList";
    }

    @RequestMapping(value = "/list/sorted", method = RequestMethod.POST)
    public String searchSorted(Model model,
                               @ModelAttribute("searchForm") SearchForm searchForm) {
        String word = searchForm.getString();
        List<Provider> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("providers", list);
        return "providerList";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    String create(Model model) {
        ProviderForm providerForm = new ProviderForm();
        model.addAttribute("providerForm", providerForm);
        return "providerAdd";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("providerForm") ProviderForm providerForm) {
        Provider provider = new Provider();
        provider.setFilm(providerForm.getFilm());
        provider.setName(providerForm.getName());
        provider.setPaint(providerForm.getPaint());
        provider.setPaper(providerForm.getPaper());
        service.save(provider);
        model.addAttribute("providers", service.getAll());
        return "redirect:/web/provider/list";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model, @PathVariable("id") String id) {
        Provider provider = service.get(id);
        ProviderForm providerForm = new ProviderForm();
        providerForm.setFilm(provider.getFilm());
        providerForm.setName(provider.getName());
        providerForm.setPaint(provider.getPaint());
        providerForm.setPaper(provider.getPaper());
        model.addAttribute("providerForm", providerForm);
        return "providerAdd";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model, @PathVariable("id") String id, @ModelAttribute("providerForm") ProviderForm providerForm) {
        Provider provider = new Provider();
        provider.setId(id);
        provider.setPaint(providerForm.getPaint());
        provider.setName(providerForm.getName());
        provider.setFilm(providerForm.getFilm());
        provider.setPaper(providerForm.getPaper());
        service.save(provider);
        model.addAttribute("providers", service.getAll());
        return "redirect:/web/provider/list";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("providers", service.getAll());
        return "redirect:/web/provider/list";
    }

}
