package edu.evhen.cursova.controller.web;

import edu.evhen.cursova.forms.OrderForm;
import edu.evhen.cursova.forms.PhotocenterForm;
import edu.evhen.cursova.forms.SearchForm;
import edu.evhen.cursova.model.Order;
import edu.evhen.cursova.model.Photocenter;
import edu.evhen.cursova.service.order.Impls.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.aggregation.BooleanOperators;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String showAll(Model model) {
        List<Order> list = service.getAll();
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("orders", list);
        return "orderList";
    }
    @PostMapping(value = "/list")
    public String search(Model model,
                         @ModelAttribute("searchForm") SearchForm searchForm) {
        String word = searchForm.getString();
        List<Order> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("orders", list);
        return "orderList";
    }



    @RequestMapping(value = "/list/sorted", method = RequestMethod.GET)
    String sort(Model model){
        List<Order> list = service.sortByName();
        model.addAttribute("orders", list);
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        return "orderList";
    }

    @RequestMapping(value = "/list/sorted", method = RequestMethod.POST)
    public String searchSorted(Model model,
                               @ModelAttribute("searchForm") SearchForm searchForm) {
        String word = searchForm.getString();
        List<Order> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("orders", list);
        return "orderList";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    String create(Model model) {
        OrderForm orderForm = new OrderForm();
        model.addAttribute("orderForm", orderForm);
        return "orderAdd";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("orderForm") OrderForm orderForm) {
        Order order = new Order();
        order.setChemical(orderForm.getChemical());
        order.setDissemination(orderForm.getDissemination());
        order.setFilm(orderForm.getFilm());
        order.setPaper(orderForm.getPaper());
        service.save(order);
        model.addAttribute("orders", service.getAll());
        return "redirect:/web/order/list";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model, @PathVariable("id") String id) {
        Order order = service.get(id);
        OrderForm orderForm = new OrderForm();
        orderForm.setChemical(order.getChemical());
        orderForm.setDissemination(order.getDissemination());
        orderForm.setFilm(order.getFilm());
        orderForm.setPaper(order.getPaper());
        model.addAttribute("orderForm", orderForm);
        return "orderAdd";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model, @PathVariable("id") String id, @ModelAttribute("orderForm") OrderForm orderForm) {
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

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("orders", service.getAll());
        return "redirect:/web/order/list";
    }

}
