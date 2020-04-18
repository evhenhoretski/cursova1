package edu.evhen.cursova.controller.api;

import edu.evhen.cursova.model.Booth;
import edu.evhen.cursova.model.Print;
import edu.evhen.cursova.service.print.Impls.PrintServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/print")
public class PrintAPIController {
    @Autowired
    PrintServiceImpl service;

    @RequestMapping("/list")
    List<Print> getAll() {
        return service.getAll();
    }

    @RequestMapping("/{id}")
    Print getById(@PathVariable("id") String id) {
        return service.get(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    Print create(@RequestBody Print print) {
        return service.save(print);
    }

    @RequestMapping("/delete/{id}")
    Print delete(@PathVariable("id") String id) {
        return service.delete(id);
    }

}
