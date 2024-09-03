package com.blazing.boost.order.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "_service")
public class ServiceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne(mappedBy = "service", cascade = CascadeType.ALL)
    private OrderEntity order;
    private String name;
    private String logo;
}
