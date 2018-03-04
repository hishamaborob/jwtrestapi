package com.aborob.jwtrestapi.security;

import java.util.Optional;

import com.aborob.jwtrestapi.entity.User;

public interface UserService {

    public Optional<User> getByUsername(String username);
}
