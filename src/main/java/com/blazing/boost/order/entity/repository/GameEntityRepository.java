package com.blazing.boost.order.entity.repository;

import com.blazing.boost.order.entity.GameEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameEntityRepository extends JpaRepository<GameEntity, Long> {
}
