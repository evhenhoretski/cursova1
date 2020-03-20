package edu.evhen.cursova.controller.web;

import edu.evhen.cursova.form.OrderForm;
import edu.evhen.cursova.form.PhotocenterForm;
import edu.evhen.cursova.model.Order;
import edu.evhen.cursova.model.Photocenter;
import edu.evhen.cursova.service.order.Impls.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/web/order")
public class OrderWEBController {
    @Autowired
    OrderServiceImpl service;

    @RequestMapping("/list")
    String getAll(Model model){
        model.addAttribute("orders", service.getAll());
        return "orderList";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("orders", service.getAll());
        return "redirect:/web/order/list";
    }

    @RequestMapping(value = "create", method = RequestMethod.GET)
    String create(Model model){
        OrderForm orderForm = new OrderForm();
        model.addAttribute("orderForm", orderForm);
        return "orderAdd";
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("orderForm") OrderForm orderForm){
        Order order = new Order();
        order.setPaper(orderForm.getPaper());
        order.setFilm(orderForm.getFilm());
        order.setChemical(orderForm.getChemical());
        order.setDissemination(orderForm.getDissemination());
        service.save(order);
        model.addAttribute("orders", service.getAll());
        return "redirect:/web/order/list";
    }

    @RequestMapping(value = "edit/{id}", method = RequestMethod.GET)
    String edit(Model model, @PathVariable("id") String id){
        Order order = service.get(id);
        OrderForm orderForm = new OrderForm();
        orderForm.setPaper(order.getPaper());
        orderForm.setFilm(order.getFilm());
        orderForm.setChemical(order.getChemical());
        orderForm.setDissemination(order.getDissemination());
        model.addAttribute("orderForm", orderForm);
        return "orderAdd";
    }

    @RequestMapping(value = "edit/{id}", method = RequestMethod.POST)
    String edit(Model model,  @PathVariable("id") String id, @ModelAttribute("orderForm") OrderForm orderForm){
        Order order = new Order();
        order.setId(id);
        order.setPaper(orderForm.getPaper());
        order.setFilm(orderForm.getFilm());
        order.setChemical(orderForm.getChemical());
        order.setDissemination(orderForm.getDissemination());
        service.save(order);
        model.addAttribute("orders", service.getAll());
        return "redirect:/web/order/list";
    }

}
