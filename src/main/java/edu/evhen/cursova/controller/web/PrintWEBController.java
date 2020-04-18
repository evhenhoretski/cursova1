package edu.evhen.cursova.controller.web;

import edu.evhen.cursova.forms.PhotocenterForm;
import edu.evhen.cursova.forms.PrintForm;
import edu.evhen.cursova.forms.SearchForm;
import edu.evhen.cursova.model.Photocenter;
import edu.evhen.cursova.model.Print;
import edu.evhen.cursova.service.print.Impls.PrintServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/web/print")
public class PrintWEBController {
    @Autowired
    PrintServiceImpl service;

    @RequestMapping("/list")
    String getAll(Model model){
        model.addAttribute("prints", service.getAll());
        return "printList";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String showAll(Model model) {
        List<Print> list = service.getAll();
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("prints", list);
        return "printList";
    }
    @PostMapping(value = "/list")
    public String search(Model model,
                         @ModelAttribute("searchForm") SearchForm searchForm) {
        String word = searchForm.getString();
        List<Print> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("prints", list);
        return "printList";
    }



    @RequestMapping(value = "/list/sorted", method = RequestMethod.GET)
    String sort(Model model){
        List<Print> list = service.sortByName();
        model.addAttribute("prints", list);
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        return "printList";
    }

    @RequestMapping(value = "/list/sorted", method = RequestMethod.POST)
    public String searchSorted(Model model,
                               @ModelAttribute("searchForm") SearchForm searchForm) {
        String word = searchForm.getString();
        List<Print> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("prints", list);
        return "printList";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    String create(Model model) {
        PrintForm printForm = new PrintForm();
        model.addAttribute("printForm", printForm);
        return "printAdd";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("printForm") PrintForm printForm) {
        Print print = new Print();
        print.setFormat(printForm.getFormat());
        print.setNumber(printForm.getNumber());
        print.setTerm(printForm.getTerm());
        print.setType(printForm.getType());
        service.save(print);
        model.addAttribute("prints", service.getAll());
        return "redirect:/web/print/list";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model, @PathVariable("id") String id) {
        Print print = service.get(id);
        PrintForm printForm = new PrintForm();
        printForm.setFormat(print.getFormat());
        printForm.setNumber(print.getNumber());
        printForm.setTerm(print.getTerm());
        printForm.setType(print.getType());
        model.addAttribute("printForm", printForm);
        return "printAdd";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model, @PathVariable("id") String id, @ModelAttribute("printForm") PrintForm printForm) {
        Print print = new Print();
        print.setId(id);
        print.setFormat(printForm.getFormat());
        print.setNumber(printForm.getNumber());
        print.setTerm(printForm.getTerm());
        print.setType(printForm.getType());
        service.save(print);
        model.addAttribute("prints", service.getAll());
        return "redirect:/web/print/list";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("prints", service.getAll());
        return "redirect:/web/print/list";
    }

}
