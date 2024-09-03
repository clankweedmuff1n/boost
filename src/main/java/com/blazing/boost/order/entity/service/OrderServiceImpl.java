package com.blazing.boost.order.entity.service;

import com.blazing.boost.order.dto.OrderDTO;
import com.blazing.boost.order.entity.OrderEntity;
import com.blazing.boost.order.entity.OrderTypeEntity;
import com.blazing.boost.order.entity.repository.*;
import com.blazing.boost.order.mapper.order.OrderMapper;
import com.blazing.boost.order.mapper.orderType.OrderTypeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    private final OrderTypeEntityRepository orderTypeRepository;
    private final ServiceEntityRepository serviceRepository;
    private final GameEntityRepository gameRepository;
    private final ApplyToCompleteEntityRepository applyToCompleteRepository;
    private final OrderMapper orderMapper;
    private final OrderTypeMapper orderTypeMapper;
    @Override
    public OrderEntity saveOrder(OrderDTO orderDTO) {
        OrderEntity orderEntity = orderMapper.toEntity(orderDTO);
        System.out.println(orderEntity);

        return null;//orderRepository.save(orderEntity);
    }
}
