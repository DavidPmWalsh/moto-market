package com.motomarket.motorcyclemarketplace.services;

import com.motomarket.motorcyclemarketplace.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    User addUser(User user);
    void deleteUser(Long id);
}
