package com.grab.store.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grab.store.model.Customer;

@Repository
public interface CustomerDAO extends JpaRepository<Customer, Integer>{

}
