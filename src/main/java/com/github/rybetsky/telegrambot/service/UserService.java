package com.github.rybetsky.telegrambot.service;

import com.github.rybetsky.telegrambot.model.User;

import java.util.List;

public interface UserService {
    User findByChatId(long id);

    List<User> findAllUsers();

    List<User> findNewUsers();

    void addUser(User user);

    void updateUser(User user);
}
