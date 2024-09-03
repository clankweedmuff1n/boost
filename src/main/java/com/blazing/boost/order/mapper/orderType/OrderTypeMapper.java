package com.blazing.boost.order.mapper.orderType;

import com.blazing.boost.order.dto.OrderTypeDTO;
import com.blazing.boost.order.entity.OrderTypeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OrderTypeMapper {
    @Mapping(target = "order", ignore = true)
    @Mapping(target = "id", ignore = true) // Этот маппинг игнорирует поле id в сущности
    @Mapping(target = "orderTypeId", source = "id") // Это поле будет заполняться значением id из DTO
    @Mapping(source = "name", target = "name")
    OrderTypeEntity toEntity(OrderTypeDTO dto);
    @Mapping(target = "id", source = "orderTypeId")
    OrderTypeDTO toDTO(OrderTypeEntity entity);
}
