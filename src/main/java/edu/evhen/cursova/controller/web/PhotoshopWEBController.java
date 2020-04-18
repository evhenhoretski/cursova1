package edu.evhen.cursova.controller.web;

import edu.evhen.cursova.forms.PhotocenterForm;
import edu.evhen.cursova.forms.PhotoshopForm;
import edu.evhen.cursova.forms.SearchForm;
import edu.evhen.cursova.model.Photocenter;
import edu.evhen.cursova.model.Photoshop;
import edu.evhen.cursova.service.photocenter.Impls.PhotocenterServiceImpl;
import edu.evhen.cursova.service.photoshop.Impls.PhotoshopServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String showAll(Model model) {
        List<Photoshop> list = service.getAll();
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("photoshops", list);
        return "photoshopList";
    }
    @PostMapping(value = "/list")
    public String search(Model model,
                         @ModelAttribute("searchForm") SearchForm searchForm) {
        String word = searchForm.getString();
        List<Photoshop> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("photoshops", list);
        return "photoshopList";
    }



    @RequestMapping(value = "/list/sorted", method = RequestMethod.GET)
    String sort(Model model){
        List<Photoshop> list = service.sortByName();
        model.addAttribute("photoshops", list);
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        return "photoshopList";
    }

    @RequestMapping(value = "/list/sorted", method = RequestMethod.POST)
    public String searchSorted(Model model,
                               @ModelAttribute("searchForm") SearchForm searchForm) {
        String word = searchForm.getString();
        List<Photoshop> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("photoshops", list);
        return "photoshopList";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    String create(Model model) {
        PhotoshopForm photoshopForm = new PhotoshopForm();
        model.addAttribute("photoshopForm", photoshopForm);
        return "photoshopAdd";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("photoshopForm") PhotoshopForm photoshopForm) {
        Photoshop photoshop = new Photoshop();
        photoshop.setAdress(photoshopForm.getAdress());
        photoshop.setArtistic(photoshopForm.getArtistic());
        photoshop.setGoods(photoshopForm.getGoods());
        photoshop.setOndocuments(photoshopForm.getOndocuments());
        photoshop.setProfessionalphoto(photoshopForm.getProfessionalphoto());
        photoshop.setRestoration(photoshopForm.getRestoration());
        photoshop.setRolling(photoshopForm.getRolling());
        photoshop.setSelling(photoshopForm.getSelling());
        service.save(photoshop);
        model.addAttribute("photoshops", service.getAll());
        return "redirect:/web/photoshop/list";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model, @PathVariable("id") String id) {
        Photoshop photoshop = service.get(id);
        PhotoshopForm photoshopForm = new PhotoshopForm();
        photoshopForm.setAdress(photoshop.getAdress());
        photoshopForm.setArtistic(photoshop.getArtistic());
        photoshopForm.setGoods(photoshop.getGoods());
        photoshopForm.setOndocuments(photoshop.getOndocuments());
        photoshopForm.setProfessionalphoto(photoshop.getProfessionalphoto());
        photoshopForm.setRestoration(photoshop.getRestoration());
        photoshopForm.setRolling(photoshop.getRolling());
        photoshopForm.setSelling(photoshop.getSelling());
        model.addAttribute("photoshopForm", photoshopForm);
        return "photoshopAdd";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model, @PathVariable("id") String id, @ModelAttribute("photoshopForm") PhotoshopForm photoshopForm) {
        Photoshop photoshop = new Photoshop();
        photoshop.setId(id);
        photoshop.setAdress(photoshopForm.getAdress());
        photoshop.setArtistic(photoshopForm.getArtistic());
        photoshop.setGoods(photoshopForm.getGoods());
        photoshop.setOndocuments(photoshopForm.getOndocuments());
        photoshop.setProfessionalphoto(photoshopForm.getProfessionalphoto());
        photoshop.setRestoration(photoshopForm.getRestoration());
        photoshop.setRolling(photoshopForm.getRolling());
        photoshop.setSelling(photoshopForm.getSelling());
        service.save(photoshop);
        model.addAttribute("photoshops", service.getAll());
        return "redirect:/web/photoshop/list";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("photoshops", service.getAll());
        return "redirect:/web/photoshop/list";
    }

}
