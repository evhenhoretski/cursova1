package edu.evhen.cursova.controller.web;

import edu.evhen.cursova.service.print.Impls.PrintServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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
        return "printList";
    }

}
