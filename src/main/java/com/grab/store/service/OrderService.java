package com.grab.store.service;

import com.grab.store.model.OrderDetails;
import com.grab.store.model.Bill;

import java.util.List;
import java.util.Optional;

public interface OrderService {

    List<OrderDetails> getAllOrders();

    Optional<OrderDetails> getOrderById(Integer id);

    OrderDetails addOrder(OrderDetails orderDetails);

    OrderDetails updateOrder(Integer id, OrderDetails orderDetails);

    void deleteOrder(Integer id);

    Bill addBill(Bill bill);

    List<Bill> getAllBills();

    Optional<Bill> getBillById(Integer id);
}

