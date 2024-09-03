package com.blazing.boost.order.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "_apply_to_complete")
public class ApplyToCompleteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne(mappedBy = "applyToComplete", cascade = CascadeType.ALL)
    private OrderEntity order;
    private int attemptsLeft;
    private boolean isSent;
}
