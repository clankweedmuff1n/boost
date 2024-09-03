package com.blazing.boost.order.mapper.service;

import com.blazing.boost.order.dto.ServiceDTO;
import com.blazing.boost.order.entity.ServiceEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ServiceMapper {
    ServiceDTO toDTO(ServiceEntity entity);
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "order", ignore = true)
    @Mapping(target = "name", source = "name")
    @Mapping(target = "logo", source = "logo")
    ServiceEntity toEntity(ServiceDTO dto);
}
