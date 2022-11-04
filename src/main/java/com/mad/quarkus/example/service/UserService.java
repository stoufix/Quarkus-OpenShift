package com.mad.quarkus.example.service;

import com.mad.quarkus.example.entity.User;
import com.mad.quarkus.example.exception.UserNotFoundException;

import java.util.List;

public interface UserService {

    User getUserById(long id) throws UserNotFoundException;

    List<User> getAllUsers();

    User updateUser(long id, User user) throws UserNotFoundException;

    User saveUser(User user);

    void deleteUser(long id) throws UserNotFoundException;
}
