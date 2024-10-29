package com.dekucodes.dreamshops.service.cart;

import com.dekucodes.dreamshops.model.Cart;
import com.dekucodes.dreamshops.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface ICartService {

    Cart getCart(Long id);
    void clearCart(Long id);
    BigDecimal getTotalPrice(Long id);

    Cart initializeNewCart(User user);

    Cart getCartByUserId(Long userId);
}
