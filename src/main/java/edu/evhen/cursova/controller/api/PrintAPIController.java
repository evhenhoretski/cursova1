package edu.evhen.cursova.controller.api;

import edu.evhen.cursova.model.Print;
import edu.evhen.cursova.service.print.Impls.PrintServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/print")
public class PrintAPIController {
    @Autowired
    PrintServiceImpl service;

    @RequestMapping("/list")
    List<Print> getAll(){
        return service.getAll();
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id){
        service.delete(id);
        model.addAttribute("print", service.getAll());
        return "printList";
    }

}
