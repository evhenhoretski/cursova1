package edu.evhen.cursova.dao.order.impls;

import edu.evhen.cursova.dao.order.interfeces.IOrderDao;
import edu.evhen.cursova.dataSet.DataSet;
import edu.evhen.cursova.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderDaoImplFake implements IOrderDao {
    @Autowired
    DataSet dataSet;

    @Override
    public Order save(Order order) {
        return null;
    }

    @Override
    public Order get(String id) {
        return null;
    }

    @Override
    public List<Order> getAll() {
        return dataSet.getOrders();
    }

    @Override
    public Order edit(Order order) {
        return null;
    }

    @Override
    public Order delete(String id) {
        return null;
    }
}
