package com.grab.store.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grab.store.model.OrderDetails;

@Repository
public interface OrderDetailsDAO extends JpaRepository<OrderDetails, Integer> {

}
