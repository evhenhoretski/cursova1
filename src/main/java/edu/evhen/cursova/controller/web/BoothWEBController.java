package edu.evhen.cursova.controller.web;

import edu.evhen.cursova.form.BoothForm;
import edu.evhen.cursova.form.PhotocenterForm;
import edu.evhen.cursova.model.Booth;
import edu.evhen.cursova.model.Photocenter;
import edu.evhen.cursova.service.booth.Impls.BoothServiceImpl;
import edu.evhen.cursova.service.photocenter.Impls.PhotocenterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("booths", service.getAll());
        return "redirect:/web/booth/list";
    }


    @RequestMapping(value = "create", method = RequestMethod.GET)
    String create(Model model){
        BoothForm boothForm = new BoothForm();
        model.addAttribute("boothForm", boothForm);
        return "boothAdd";
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("boothForm") BoothForm boothForm){
        Booth booth = new Booth();
        booth.setAdress(boothForm.getAdress());
        booth.setWorkplace(boothForm.getWorkplace());
        booth.setManifestation(boothForm.getManifestation());
        booth.setPrinting(boothForm.getPrinting());
        booth.setDiscountcard(boothForm.getDiscountcard());
        booth.setSelling(boothForm.getSelling());
        booth.setProceeds(boothForm.getProceeds());
        booth.setGoods(boothForm.getGoods());
        service.save(booth);
        model.addAttribute("booths", service.getAll());
        return "redirect:/web/booth/list";
    }

    @RequestMapping(value = "edit/{id}", method = RequestMethod.GET)
    String edit(Model model, @PathVariable("id") String id){
        Booth booth = service.get(id);
        BoothForm boothForm = new BoothForm();
        boothForm.setAdress(booth.getAdress());
        boothForm.setWorkplace(booth.getWorkplace());
        boothForm.setManifestation(booth.getManifestation());
        boothForm.setPrinting(booth.getPrinting());
        boothForm.setDiscountcard(booth.getDiscountcard());
        boothForm.setSelling(booth.getSelling());
        boothForm.setProceeds(booth.getProceeds());
        boothForm.setGoods(booth.getGoods());
        model.addAttribute("boothForm", boothForm);
        return "boothAdd";
    }

    @RequestMapping(value = "edit/{id}", method = RequestMethod.POST)
    String edit(Model model,  @PathVariable("id") String id, @ModelAttribute("boothForm") BoothForm boothForm){
        Booth booth = new Booth();
        booth.setId(id);
        booth.setAdress(boothForm.getAdress());
        booth.setWorkplace(boothForm.getWorkplace());
        booth.setManifestation(boothForm.getManifestation());
        booth.setPrinting(boothForm.getPrinting());
        booth.setDiscountcard(boothForm.getDiscountcard());
        booth.setSelling(boothForm.getSelling());
        booth.setProceeds(boothForm.getProceeds());
        booth.setGoods(boothForm.getGoods());
        service.save(booth);
        model.addAttribute("booths", service.getAll());
        return "redirect:/web/booth/list";
    }

}
