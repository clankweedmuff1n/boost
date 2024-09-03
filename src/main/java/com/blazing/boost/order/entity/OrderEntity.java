package com.blazing.boost.order.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "_order")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String webSiteId;
    private String orderSid;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "service_id", referencedColumnName = "id")
    private ServiceEntity service;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "game_id", referencedColumnName = "id")
    private GameEntity game;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime boughtAt;
    private String completionTime;
    private String startingTime;
    private int overwrittenStartingTime;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_type_id", referencedColumnName = "id")
    private OrderTypeEntity orderType;
    private String note;
    private boolean isHighPriority;
    private boolean allowedManualPick;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "apply_to_complete_id", referencedColumnName = "id")
    private ApplyToCompleteEntity applyToComplete;
}