package com.grab.store.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grab.store.model.Item;

@Repository
public interface ItemDAO extends JpaRepository<Item, Integer> {

}
