package com.chrisferdev.farmacia.backend.domain.port;

import com.chrisferdev.farmacia.backend.domain.model.User;

public interface IUserRepository {
    User save(User user);
    User findByEmail(String email);
    User findById(Integer id);
}
