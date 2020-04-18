package edu.evhen.cursova.controller.web;

import edu.evhen.cursova.forms.BoothForm;
import edu.evhen.cursova.forms.PhotocenterForm;
import edu.evhen.cursova.forms.SearchForm;
import edu.evhen.cursova.model.Booth;
import edu.evhen.cursova.model.Photocenter;
import edu.evhen.cursova.service.booth.Impls.BoothServiceImpl;
import edu.evhen.cursova.service.photocenter.Impls.PhotocenterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/web/booth")
public class BoothWEBController {
    @Autowired
    BoothServiceImpl service;

    @RequestMapping("/list")
    String getAll(Model model){
        model.addAttribute("booths", service.getAll());
        return "boothList";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String showAll(Model model) {
        List<Booth> list = service.getAll();
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("booths", list);
        return "boothList";
    }
    @PostMapping(value = "/list")
    public String search(Model model,
                         @ModelAttribute("searchForm") SearchForm searchForm) {
        String word = searchForm.getString();
        List<Booth> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("booths", list);
        return "boothList";
    }



    @RequestMapping(value = "/list/sorted", method = RequestMethod.GET)
    String sort(Model model){
        List<Booth> list = service.sortByName();
        model.addAttribute("booths", list);
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        return "boothList";
    }

    @RequestMapping(value = "/list/sorted", method = RequestMethod.POST)
    public String searchSorted(Model model,
                               @ModelAttribute("searchForm") SearchForm searchForm) {
        String word = searchForm.getString();
        List<Booth> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("booths", list);
        return "boothList";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    String create(Model model) {
        BoothForm boothForm = new BoothForm();
        model.addAttribute("boothForm", boothForm);
        return "boothAdd";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("boothForm") BoothForm boothForm) {
        Booth booth = new Booth();
        booth.setAdress(boothForm.getAdress());
        booth.setDiscountcard(boothForm.getDiscountcard());
        booth.setGoods(boothForm.getGoods());
        booth.setManifestation(boothForm.getManifestation());
        booth.setPrinting(boothForm.getPrinting());
        booth.setProceeds(boothForm.getProceeds());
        booth.setSelling(boothForm.getSelling());
        booth.setWorkplace(boothForm.getWorkplace());
        service.save(booth);
        model.addAttribute("booths", service.getAll());
        return "redirect:/web/booth/list";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model, @PathVariable("id") String id) {
        Booth booth = service.get(id);
        BoothForm boothForm = new BoothForm();
        boothForm.setAdress(booth.getAdress());
        boothForm.setDiscountcard(booth.getDiscountcard());
        boothForm.setGoods(booth.getGoods());
        boothForm.setManifestation(booth.getManifestation());
        boothForm.setPrinting(booth.getPrinting());
        boothForm.setProceeds(booth.getProceeds());
        boothForm.setSelling(booth.getSelling());
        boothForm.setWorkplace(booth.getWorkplace());
        model.addAttribute("boothForm", boothForm);
        return "boothAdd";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model, @PathVariable("id") String id, @ModelAttribute("boothForm") BoothForm boothForm) {
        Booth booth = new Booth();
        booth.setId(id);
        booth.setWorkplace(boothForm.getWorkplace());
        booth.setSelling(boothForm.getSelling());
        booth.setProceeds(boothForm.getProceeds());
        booth.setPrinting(boothForm.getPrinting());
        booth.setManifestation(boothForm.getManifestation());
        booth.setGoods(boothForm.getGoods());
        booth.setDiscountcard(boothForm.getDiscountcard());
        booth.setAdress(boothForm.getAdress());
        service.save(booth);
        model.addAttribute("booths", service.getAll());
        return "redirect:/web/booth/list";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("booths", service.getAll());
        return "redirect:/web/booth/list";
    }

}
