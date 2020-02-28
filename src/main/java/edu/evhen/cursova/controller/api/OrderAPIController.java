package edu.evhen.cursova.controller.api;

import edu.evhen.cursova.model.Order;
import edu.evhen.cursova.service.order.Impls.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderAPIController {
    @Autowired
    OrderServiceImpl service;

    @RequestMapping("/list")
    List<Order> getAll(){
        return service.getAll();
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id){
        service.delete(id);
        model.addAttribute("order", service.getAll());
        return "orderList";
    }

}
