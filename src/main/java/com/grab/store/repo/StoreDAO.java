package com.grab.store.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grab.store.model.Store;

@Repository
public interface StoreDAO extends JpaRepository<Store, Integer> {

}
