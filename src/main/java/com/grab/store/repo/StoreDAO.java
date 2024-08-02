package com.grab.store.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.grab.store.model.Store;

public interface StoreDAO extends JpaRepository<Store, Integer> {
}
