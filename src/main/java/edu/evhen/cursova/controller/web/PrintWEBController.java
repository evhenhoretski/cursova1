package edu.evhen.cursova.controller.web;

import edu.evhen.cursova.form.PhotocenterForm;
import edu.evhen.cursova.form.PrintForm;
import edu.evhen.cursova.model.Photocenter;
import edu.evhen.cursova.model.Print;
import edu.evhen.cursova.service.print.Impls.PrintServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("prints", service.getAll());
        return "redirect:/web/print/list";
    }


    @RequestMapping(value = "create", method = RequestMethod.GET)
    String create(Model model){
        PrintForm printForm = new PrintForm();
        model.addAttribute("printForm", printForm);
        return "printAdd";
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("printForm") PrintForm printForm){
        Print print = new Print();
        print.setNumber(printForm.getNumber());
        print.setFormat(printForm.getFormat());
        print.setType(printForm.getType());
        print.setTerm(printForm.getTerm());
        service.save(print);
        model.addAttribute("prints", service.getAll());
        return "redirect:/web/print/list";
    }

    @RequestMapping(value = "edit/{id}", method = RequestMethod.GET)
    String edit(Model model, @PathVariable("id") String id){
        Print print = service.get(id);
        PrintForm printForm = new PrintForm();
        printForm.setNumber(print.getNumber());
        printForm.setFormat(print.getFormat());
        printForm.setType(print.getType());
        printForm.setTerm(print.getTerm());
        model.addAttribute("printForm", printForm);
        return "printAdd";
    }

    @RequestMapping(value = "edit/{id}", method = RequestMethod.POST)
    String edit(Model model,  @PathVariable("id") String id, @ModelAttribute("printForm") PrintForm printForm){
        Print print = new Print();
        print.setId(id);
        print.setNumber(printForm.getNumber());
        print.setFormat(printForm.getFormat());
        print.setType(printForm.getType());
        print.setTerm(printForm.getTerm());
        service.save(print);
        model.addAttribute("prints", service.getAll());
        return "redirect:/web/print/list";
    }
}
