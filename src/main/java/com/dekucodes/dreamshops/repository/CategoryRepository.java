package com.dekucodes.dreamshops.repository;

import com.dekucodes.dreamshops.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String name);

    Category getCategoryById(Long id);

    boolean existsByName(String name);
}
