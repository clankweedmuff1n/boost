package com.blazing.boost.order.mapper.service;

import com.blazing.boost.order.dto.ServiceDTO;
import com.blazing.boost.order.entity.ServiceEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ServiceMapper {
    ServiceMapper INSTANCE = Mappers.getMapper(ServiceMapper.class);
    ServiceDTO toDTO(ServiceEntity entity);
    ServiceEntity toEntity(ServiceDTO dto);
}
