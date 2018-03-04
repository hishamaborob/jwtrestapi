package com.aborob.jwtrestapi.user.service;

import java.util.Optional;

import com.aborob.jwtrestapi.entity.User;
import com.aborob.jwtrestapi.security.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aborob.jwtrestapi.user.repository.UserRepository;

@Service
public class DatabaseUserService implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public DatabaseUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }

    @Override
    public Optional<User> getByUsername(String username) {
        return this.userRepository.findByUsername(username);
    }
}
