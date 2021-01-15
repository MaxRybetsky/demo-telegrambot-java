package com.github.rybetsky.telegrambot.service;

import com.github.rybetsky.telegrambot.model.User;
import com.github.rybetsky.telegrambot.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public User findByChatId(long id) {
        return userRepository.findByChatId(id);
    }

    @Override
    @Transactional
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    @Transactional
    public List<User> findNewUsers() {
        List<User> users = userRepository.findNewUsers();
        users.forEach(user -> user.setNotified(true));
        userRepository.saveAll(users);
        return users;
    }

    @Override
    @Transactional
    public void addUser(User user) {
        user.setAdmin(userRepository.count() == 0);
        userRepository.save(user);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        userRepository.save(user);
    }
}
