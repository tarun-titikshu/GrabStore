package com.grab.store.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grab.store.model.Cart;

@Repository
public interface CartDAO extends JpaRepository<Cart, Integer> {

}
