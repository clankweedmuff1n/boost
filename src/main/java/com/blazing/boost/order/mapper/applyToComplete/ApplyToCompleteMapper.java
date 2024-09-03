package com.blazing.boost.order.mapper.applyToComplete;

import com.blazing.boost.order.dto.ApplyToCompleteDTO;
import com.blazing.boost.order.entity.ApplyToCompleteEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ApplyToCompleteMapper {
    ApplyToCompleteDTO toDTO(ApplyToCompleteEntity entity);
    ApplyToCompleteEntity toEntity(ApplyToCompleteDTO dto);
}
