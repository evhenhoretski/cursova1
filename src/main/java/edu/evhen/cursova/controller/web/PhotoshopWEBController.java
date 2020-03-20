package edu.evhen.cursova.controller.web;

import edu.evhen.cursova.form.PhotocenterForm;
import edu.evhen.cursova.form.PhotoshopForm;
import edu.evhen.cursova.model.Photocenter;
import edu.evhen.cursova.model.Photoshop;
import edu.evhen.cursova.service.photocenter.Impls.PhotocenterServiceImpl;
import edu.evhen.cursova.service.photoshop.Impls.PhotoshopServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/web/photoshop")
public class PhotoshopWEBController {
    @Autowired
    PhotoshopServiceImpl service;

    @RequestMapping("/list")
    String getAll(Model model){
        model.addAttribute("photoshops", service.getAll());
        return "photoshopList";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("photoshops", service.getAll());
        return "redirect:/web/photoshop/list";
    }


    @RequestMapping(value = "create", method = RequestMethod.GET)
    String create(Model model){
        PhotoshopForm photoshopForm = new PhotoshopForm();
        model.addAttribute("photoshopForm", photoshopForm);
        return "photoshopAdd";
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("photoshopForm") PhotoshopForm photoshopForm){
        Photoshop photoshop = new Photoshop();
        photoshop.setSelling(photoshopForm.getSelling());
        photoshop.setOndocuments(photoshopForm.getOndocuments());
        photoshop.setRestoration(photoshopForm.getRestoration());
        photoshop.setRolling(photoshopForm.getRolling());
        photoshop.setArtistic(photoshopForm.getArtistic());
        photoshop.setProfessionalphoto(photoshopForm.getProfessionalphoto());
        photoshop.setGoods(photoshopForm.getGoods());
        photoshop.setAdress(photoshopForm.getAdress());
        service.save(photoshop);
        model.addAttribute("photoshops", service.getAll());
        return "redirect:/web/photoshop/list";
    }

    @RequestMapping(value = "edit/{id}", method = RequestMethod.GET)
    String edit(Model model, @PathVariable("id") String id){
        Photoshop photoshop = service.get(id);
        PhotoshopForm photoshopForm = new PhotoshopForm();
        photoshopForm.setSelling(photoshop.getSelling());
        photoshopForm.setOndocuments(photoshop.getOndocuments());
        photoshopForm.setRestoration(photoshop.getRestoration());
        photoshopForm.setRolling(photoshop.getRolling());
        photoshopForm.setArtistic(photoshop.getArtistic());
        photoshopForm.setProfessionalphoto(photoshop.getProfessionalphoto());
        photoshopForm.setGoods(photoshop.getGoods());
        photoshopForm.setAdress(photoshop.getAdress());
        model.addAttribute("photoshopForm", photoshopForm);
        return "photoshopAdd";
    }

    @RequestMapping(value = "edit/{id}", method = RequestMethod.POST)
    String edit(Model model,  @PathVariable("id") String id, @ModelAttribute("photoshopForm") PhotoshopForm photoshopForm){
        Photoshop photoshop = new Photoshop();
        photoshop.setId(id);
        photoshop.setSelling(photoshopForm.getSelling());
        photoshop.setOndocuments(photoshopForm.getOndocuments());
        photoshop.setRestoration(photoshopForm.getRestoration());
        photoshop.setRolling(photoshopForm.getRolling());
        photoshop.setArtistic(photoshopForm.getArtistic());
        photoshop.setProfessionalphoto(photoshopForm.getProfessionalphoto());
        photoshop.setGoods(photoshopForm.getGoods());
        photoshop.setAdress(photoshopForm.getAdress());
        service.save(photoshop);
        model.addAttribute("photoshops", service.getAll());
        return "redirect:/web/photoshop/list";
    }
}
