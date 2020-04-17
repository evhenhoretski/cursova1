package edu.evhen.cursova.controller.web;

import edu.evhen.cursova.forms.SearchForm;
import edu.evhen.cursova.model.Photocenter;
import edu.evhen.cursova.service.photocenter.Impls.PhotocenterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/web/photocenter")
public class PhotocenterWEBController {
    @Autowired
    PhotocenterServiceImpl service;

    @RequestMapping("/list")
    String getAll(Model model){
        model.addAttribute("photocenters", service.getAll());
        return "photocenterList";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String showAll(Model model) {
        List<Photocenter> list = service.getAll();
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("photocenters", list);
        return "photocenterList";
    }
    @PostMapping(value = "/list")
    public String search(Model model,
                         @ModelAttribute("searchForm") SearchForm searchForm) {
        String word = searchForm.getString();
        List<Photocenter> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("photocenters", list);
        return "redirect:/web/photocenter/list";
    }



    @RequestMapping(value = "/list/sorted", method = RequestMethod.GET)
    String sort(Model model){
        List<Photocenter> list = service.sortByEmail();
        model.addAttribute("photocenters", list);
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        return "photocenterList";
    }

    @RequestMapping(value = "/list/sorted", method = RequestMethod.POST)
    public String searchSorted(Model model,
                               @ModelAttribute("searchForm") SearchForm searchForm) {
        String word = searchForm.getString();
        List<Photocenter> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("photocenters", list);
        return "redirect:/web/photocenter/list";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("photocenters", service.getAll());
        return "redirect:/web/photocenter/list";
    }

}
