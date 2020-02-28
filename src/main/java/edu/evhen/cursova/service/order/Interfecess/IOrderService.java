package edu.evhen.cursova.service.order.Interfecess;

import edu.evhen.cursova.model.Order;
import edu.evhen.cursova.model.Photocenter;

import java.util.List;

public interface IOrderService {
    Order save(Order order);
    Order get(String id);
    List<Order> getAll();
    Order edit(Order order);
    Order delete(String id);
}
