package com.blazing.boost.order.mapper.service;

import com.blazing.boost.order.dto.ServiceDTO;
import com.blazing.boost.order.entity.ServiceEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = ServiceMapper.class)
public interface ServiceListMapper {
    ServiceListMapper INSTANCE = Mappers.getMapper(ServiceListMapper.class);
    List<ServiceDTO> toDTOs(List<ServiceEntity> entity);
    List<ServiceEntity> toEntities(List<ServiceDTO> dtoList);
}
