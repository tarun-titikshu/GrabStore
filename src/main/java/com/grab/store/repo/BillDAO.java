package com.grab.store.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grab.store.model.Bill;

@Repository
public interface BillDAO extends JpaRepository<Bill, Integer> {

}
