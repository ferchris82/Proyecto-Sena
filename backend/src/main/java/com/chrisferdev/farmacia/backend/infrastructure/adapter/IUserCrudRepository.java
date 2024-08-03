package com.chrisferdev.farmacia.backend.infrastructure.adapter;

import com.chrisferdev.farmacia.backend.infrastructure.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IUserCrudRepository extends JpaRepository<UserEntity, Integer> {
}
