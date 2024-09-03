package com.blazing.boost.order.mapper.orderType;

import com.blazing.boost.order.dto.OrderDTO;
import com.blazing.boost.order.dto.OrderTypeDTO;
import com.blazing.boost.order.entity.OrderTypeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = OrderTypeMapper.class)
public interface OrderTypeListMapper {
    List<OrderTypeDTO> toDTOs(List<OrderTypeEntity> entities);
    List<OrderTypeEntity> toEntities(List<OrderDTO> dtoList);
}
