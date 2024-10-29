package com.dekucodes.dreamshops.dto;

import com.dekucodes.dreamshops.model.Cart;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
public class OrderDto {

    private Long id;
    private Long userId;
    private LocalDate orderDate;
    private BigDecimal totalAmount;
    private String status;
    private List<OrderItemDto> items;
    private CartDto cart;
}
