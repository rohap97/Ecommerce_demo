package com.dekucodes.dreamshops.service.order;

import com.dekucodes.dreamshops.dto.OrderDto;
import com.dekucodes.dreamshops.model.Order;

import java.util.List;

public interface IOrderService {

    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);

    List<OrderDto> getUserOrders(Long userId);

    OrderDto convertToDto(Order order);
}
