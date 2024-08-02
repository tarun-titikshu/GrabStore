package com.grab.store.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.grab.store.model.Category;

@Repository
public interface CategoryDAO extends JpaRepository< Category, Integer>{

}
