package com.example.hspspringappsample.service;

import com.example.hspspringappsample.model.User;

public interface UserService {
    User createUser(User user);
    User getUserById(Long id);
    void deleteUser(Long id);
}
