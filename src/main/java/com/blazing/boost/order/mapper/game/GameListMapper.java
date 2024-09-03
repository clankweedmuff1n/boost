package com.blazing.boost.order.mapper.game;

import com.blazing.boost.order.dto.GameDTO;
import com.blazing.boost.order.entity.GameEntity;
import com.blazing.boost.order.mapper.applyToComplete.ApplyToCompleteListMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = GameMapper.class)
public interface GameListMapper {
    List<GameDTO> toDTOs(List<GameEntity> entity);
    List<GameEntity> toEntities(List<GameDTO> dtoList);
}
