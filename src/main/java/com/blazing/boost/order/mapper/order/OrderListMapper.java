package com.blazing.boost.order.mapper.order;

import com.blazing.boost.order.dto.OrderDTO;
import com.blazing.boost.order.entity.OrderEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = OrderMapper.class)
public interface OrderListMapper {
    List<OrderDTO> toDTOs(List<OrderEntity> entity);
    List<OrderEntity> toEntities(List<OrderDTO> dtoList);
}
