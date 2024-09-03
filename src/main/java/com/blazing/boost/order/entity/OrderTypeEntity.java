package com.blazing.boost.order.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "_orderType")
public class OrderTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne(mappedBy = "orderType", cascade = CascadeType.ALL)
    private OrderEntity order;
    private int orderTypeId;
    private String name;
}
