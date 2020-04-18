package edu.evhen.cursova.controller.api;

import edu.evhen.cursova.model.Booth;
import edu.evhen.cursova.model.Order;
import edu.evhen.cursova.service.order.Impls.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderAPIController {
    @Autowired
    OrderServiceImpl service;

    @RequestMapping("/list")
    List<Order> getAll() {
        return service.getAll();
    }

    @RequestMapping("/{id}")
    Order getById(@PathVariable("id") String id) {
        return service.get(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    Order create(@RequestBody Order order) {
        return service.save(order);
    }

    @RequestMapping("/delete/{id}")
    Order delete(@PathVariable("id") String id) {
        return service.delete(id);
    }

}
