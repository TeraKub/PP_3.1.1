package com.maxchuma.pp_3_1_1.service;

import com.maxchuma.pp_3_1_1.model.User;
import com.maxchuma.pp_3_1_1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService{
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userRepository.saveAndFlush(user);
    }

    @Override
    public User getUser(int id) {
        return userRepository.getById(id);
    }

    @Override
    @Transactional
    public void delete(int id) {
        userRepository.deleteById(id);
    }

}
