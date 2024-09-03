package com.blazing.boost.order.entity.repository;

import com.blazing.boost.order.entity.OrderTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderTypeEntityRepository extends JpaRepository<OrderTypeEntity, Long> {
}
