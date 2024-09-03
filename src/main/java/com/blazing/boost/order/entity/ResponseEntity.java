package com.blazing.boost.order.entity;

import lombok.Data;
import jakarta.persistence.*;

import java.util.List;

@Data
public class ResponseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int totalCount;
    private int limit;
    private int offset;
    private List<OrderEntity> items;
}
