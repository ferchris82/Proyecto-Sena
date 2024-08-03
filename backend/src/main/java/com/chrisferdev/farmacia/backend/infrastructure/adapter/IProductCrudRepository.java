package com.chrisferdev.farmacia.backend.infrastructure.adapter;

import com.chrisferdev.farmacia.backend.infrastructure.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductCrudRepository extends JpaRepository<ProductEntity, Integer> {
}
