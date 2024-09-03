package com.blazing.boost.order.mapper.game;

import com.blazing.boost.order.dto.GameDTO;
import com.blazing.boost.order.entity.GameEntity;
import com.blazing.boost.order.mapper.service.ServiceMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface GameMapper {
    GameDTO toDTO(GameEntity entity);
    GameEntity toEntity(GameDTO dto);
}
