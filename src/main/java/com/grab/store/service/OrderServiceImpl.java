package com.grab.store.service;

import com.grab.store.model.OrderDetails;
import com.grab.store.repo.BillDAO;
import com.grab.store.repo.OrderDetailsDAO;
import com.grab.store.model.Bill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl extends OrderDetails {

    @Autowired
    private OrderDetailsDAO orderDetailsDAO;

    @Autowired
    private BillDAO billDAO;

    public List<OrderDetails> getAllOrders() {
        return orderDetailsDAO.findAll();
    }

    public Optional<OrderDetails> getOrderById(Integer id) {
        return orderDetailsDAO.findById(id);
    }

    public OrderDetails addOrder(OrderDetails orderDetails) {
        return orderDetailsDAO.save(orderDetails);
    }

    public OrderDetails updateOrder(Integer id, OrderDetails orderDetails) {
        OrderDetails existingOrder = orderDetailsDAO.findById(id).orElseThrow(() -> new RuntimeException("Order not found"));
        existingOrder.setOrderDate(orderDetails.getOrderDate());
        existingOrder.setOrderStatus(orderDetails.getOrderStatus());
        return orderDetailsDAO.save(existingOrder);
    }

    public void deleteOrder(Integer id) {
        orderDetailsDAO.deleteById(id);
    }

    public Bill addBill(Bill bill) {
        return billDAO.save(bill);
    }

    public List<Bill> getAllBills() {
        return billDAO.findAll();
    }

    public Optional<Bill> getBillById(Integer id) {
        return billDAO.findById(id);
    }
}

