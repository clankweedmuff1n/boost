package com.blazing.boost.order.dto;

import lombok.Data;

import java.util.List;

@Data
public class ResponseDTO {
    private int totalCount;
    private int limit;
    private int offset;
    private List<OrderDTO> items;
}
