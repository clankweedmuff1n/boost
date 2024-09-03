package com.blazing.boost.order.entity.repository;

import com.blazing.boost.order.entity.ApplyToCompleteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplyToCompleteEntityRepository extends JpaRepository<ApplyToCompleteEntity, Long> {
}
