package com.blazing.boost.order.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "_game")
public class GameEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne(mappedBy = "game", cascade = CascadeType.ALL)
    private OrderEntity order;
    private int gameId;
    private String gameName;
}
