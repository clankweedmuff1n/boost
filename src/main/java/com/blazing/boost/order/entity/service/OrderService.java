package com.blazing.boost.order.entity.service;

import com.blazing.boost.order.dto.OrderDTO;
import com.blazing.boost.order.entity.OrderEntity;

public interface OrderService {
    OrderEntity saveOrder(OrderDTO orderDTO);
}
