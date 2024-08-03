package com.chrisferdev.farmacia.backend.infrastructure.adapter;

import com.chrisferdev.farmacia.backend.infrastructure.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryCrudRepository extends JpaRepository<CategoryEntity, Integer> {
}
