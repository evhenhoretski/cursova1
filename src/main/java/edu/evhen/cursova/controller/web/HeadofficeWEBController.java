package edu.evhen.cursova.controller.web;

import edu.evhen.cursova.form.HeadofficeForm;
import edu.evhen.cursova.form.PhotocenterForm;
import edu.evhen.cursova.model.Headoffice;
import edu.evhen.cursova.model.Photocenter;
import edu.evhen.cursova.service.headoffice.Impls.HeadofficeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/web/headoffice")
public class HeadofficeWEBController {
    @Autowired
    HeadofficeServiceImpl service;

    @RequestMapping("/list")
    String getAll(Model model){
        model.addAttribute("headoffices", service.getAll());
        return "headofficeList";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("headoffices", service.getAll());
        return "redirect:/web/headoffice/list";
    }


    @RequestMapping(value = "create", method = RequestMethod.GET)
    String create(Model model){
        HeadofficeForm headofficeForm = new HeadofficeForm();
        model.addAttribute("headofficeForm", headofficeForm);
        return "headofficeAdd";
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("photocenterForm") HeadofficeForm headofficeForm){
        Headoffice headoffice = new Headoffice();
        headoffice.setAdress(headofficeForm.getAdress());
        service.save(headoffice);
        model.addAttribute("headoffices", service.getAll());
        return "redirect:/web/headoffice/list";
    }

    @RequestMapping(value = "edit/{id}", method = RequestMethod.GET)
    String edit(Model model, @PathVariable("id") String id){
        Headoffice headoffice = service.get(id);
        HeadofficeForm headofficeForm = new HeadofficeForm();
        headofficeForm.setAdress(headoffice.getAdress());
        model.addAttribute("headofficeForm", headofficeForm);
        return "headofficeAdd";
    }

    @RequestMapping(value = "edit/{id}", method = RequestMethod.POST)
    String edit(Model model,  @PathVariable("id") String id, @ModelAttribute("photocenterForm") HeadofficeForm headofficeForm){
        Headoffice headoffice = new Headoffice();
        headoffice.setId(id);
        headoffice.setAdress(headofficeForm.getAdress());
        service.save(headoffice);
        model.addAttribute("headoffices", service.getAll());
        return "redirect:/web/headoffice/list";
    }

}
