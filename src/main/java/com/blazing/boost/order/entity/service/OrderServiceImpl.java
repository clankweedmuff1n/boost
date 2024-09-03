package com.blazing.boost.order.entity.service;

import com.blazing.boost.order.dto.OrderDTO;
import com.blazing.boost.order.entity.OrderEntity;
import com.blazing.boost.order.entity.repository.*;
import com.blazing.boost.order.mapper.order.OrderMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderMapper orderMapper;
    private final OrderRepository orderRepository;
    @Override
    @Announce
    public OrderEntity saveOrder(OrderDTO orderDTO) {
        return orderRepository.save(orderMapper.toEntity(orderDTO));
    }
}
