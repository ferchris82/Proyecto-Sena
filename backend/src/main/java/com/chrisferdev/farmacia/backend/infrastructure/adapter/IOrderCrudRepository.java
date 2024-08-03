package com.chrisferdev.farmacia.backend.infrastructure.adapter;

import com.chrisferdev.farmacia.backend.domain.model.OrderState;
import com.chrisferdev.farmacia.backend.infrastructure.entity.OrderEntity;
import com.chrisferdev.farmacia.backend.infrastructure.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface IOrderCrudRepository extends JpaRepository<OrderEntity, Integer> {
    @Transactional
    @Modifying
    @Query("UPDATE OrderEntity o SET o.orderState = :state WHERE o.id = :id")
    void updateStateById(Integer id, OrderState state);

    Iterable<OrderEntity> findByUserEntity(UserEntity userEntity);
}
