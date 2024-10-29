package com.dekucodes.dreamshops.repository;

import com.dekucodes.dreamshops.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long > {
    void deleteAllByCartId(Long id);
}
