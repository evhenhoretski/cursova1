package edu.evhen.cursova.controller.web;

import edu.evhen.cursova.form.PhotocenterForm;
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

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("photocenters", service.getAll());
        return "redirect:/web/photocenter/list";
    }

    @RequestMapping(value = "create", method = RequestMethod.GET)
    String create(Model model){
        PhotocenterForm photocenterForm = new PhotocenterForm();
        model.addAttribute("photocenterForm", photocenterForm);
        return "photocenterAdd";
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("photocenterForm") PhotocenterForm photocenterForm){
        Photocenter photocenter = new Photocenter();
        photocenter.setOrder(photocenterForm.getOrder());
        photocenter.setProceeds(photocenterForm.getProceeds());
        photocenter.setWorkplace(photocenterForm.getWorkplace());
        service.save(photocenter);
        model.addAttribute("photocenters", service.getAll());
        return "redirect:/web/photocenter/list";
    }

    @RequestMapping(value = "edit/{id}", method = RequestMethod.GET)
    String edit(Model model, @PathVariable("id") String id){
        Photocenter photocenter = service.get(id);
        PhotocenterForm photocenterForm = new PhotocenterForm();
        photocenterForm.setOrder(photocenter.getOrder());
        photocenterForm.setProceeds(photocenter.getProceeds());
        photocenterForm.setWorkplace(photocenter.getProceeds());
        model.addAttribute("photocenterForm", photocenterForm);
        return "photocenterAdd";
    }

    @RequestMapping(value = "edit/{id}", method = RequestMethod.POST)
    String edit(Model model,  @PathVariable("id") String id, @ModelAttribute("photocenterForm") PhotocenterForm photocenterForm){
        Photocenter photocenter = new Photocenter();
        photocenter.setId(id);
        photocenter.setOrder(photocenterForm.getOrder());
        photocenter.setProceeds(photocenterForm.getProceeds());
        photocenter.setWorkplace(photocenterForm.getWorkplace());
        service.save(photocenter);
        model.addAttribute("photocenters", service.getAll());
        return "redirect:/web/photocenter/list";
    }
}
