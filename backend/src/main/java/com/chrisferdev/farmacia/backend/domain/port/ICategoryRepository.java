package com.chrisferdev.farmacia.backend.domain.port;

import com.chrisferdev.farmacia.backend.domain.model.Category;

public interface ICategoryRepository {
    Category save(Category category);
    Iterable<Category> findAll();
    Category findById(Integer id);
    void deleteById(Integer id);
}
