package com.blazing.boost.order.mapper.order;

import com.blazing.boost.order.dto.OrderDTO;
import com.blazing.boost.order.entity.OrderEntity;
import com.blazing.boost.order.mapper.applyToComplete.ApplyToCompleteMapper;
import com.blazing.boost.order.mapper.game.GameMapper;
import com.blazing.boost.order.mapper.orderType.OrderTypeMapper;
import com.blazing.boost.order.mapper.service.ServiceMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = { ServiceMapper.class, GameMapper.class, OrderTypeMapper.class, ApplyToCompleteMapper.class })
public interface OrderMapper {
    @Mapping(source = "webSiteId", target = "id") // Map webSiteId from OrderEntity to id in OrderDTO
    @Mapping(source = "service", target = "service") // Map service entity to service DTO
    @Mapping(source = "game", target = "game") // Map game entity to game DTO
    //@Mapping(source = "orderType", target = "orderType") // Map orderType entity to orderType DTO
    @Mapping(source = "applyToComplete", target = "applyToComplete") // Map applyToComplete entity to applyToComplete DTO
    OrderDTO toDTO(OrderEntity entity);

    @Mapping(source = "id", target = "webSiteId") // Map id from DTO to webSiteId in Entity
    @Mapping(target = "id", ignore = true) // Ensure id in OrderEntity is not set
    @Mapping(source = "service", target = "service") // Map service DTO to service entity
    @Mapping(source = "game", target = "game") // Map game DTO to game entity
    @Mapping(source = "orderType", target = "orderType") // Map orderType DTO to orderType entity
    @Mapping(source = "applyToComplete", target = "applyToComplete") // Map applyToComplete DTO to applyToComplete entity
    OrderEntity toEntity(OrderDTO dto);
}
