package com.blazing.boost.order.mapper.applyToComplete;

import com.blazing.boost.order.dto.ApplyToCompleteDTO;
import com.blazing.boost.order.entity.ApplyToCompleteEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = ApplyToCompleteMapper.class)
public interface ApplyToCompleteListMapper {
    List<ApplyToCompleteDTO> toDTOs(List<ApplyToCompleteEntity> entity);
    List<ApplyToCompleteEntity> toEntities(List<ApplyToCompleteDTO> dtoList);
}
