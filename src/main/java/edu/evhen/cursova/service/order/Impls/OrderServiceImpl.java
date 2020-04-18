package edu.evhen.cursova.service.order.Impls;

import edu.evhen.cursova.dao.order.impls.OrderDaoImplFake;
import edu.evhen.cursova.dao.repository.OrderRepository;
import edu.evhen.cursova.model.Order;
import edu.evhen.cursova.model.Photocenter;
import edu.evhen.cursova.service.order.Interfecess.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements IOrderService {
    @Autowired
    OrderDaoImplFake dao;

    @Autowired
    OrderRepository repository;

    @PostConstruct
    void init(){
        List<Order> list = dao.getAll();
        repository.saveAll(list);
    }

    @Override
    public Order save(Order order) {
        return repository.save(order);
    }

    @Override
    public Order get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Order> getAll() {
        return repository.findAll();
    }

    @Override
    public Order edit(Order order) {
        return repository.save(order);
    }

    @Override
    public Order delete(String id) {
        Order order = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return order;
    }

    public List<Order> search(String word) {
        return this.getAll().stream()
                .filter(order -> order.getDissemination()
                        .toLowerCase().contains(word.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Order> sortByName() {
        return this.getAll().stream().sorted(Comparator.comparing(Order::getPaper))
                .collect(Collectors.toList());
    }

    }
