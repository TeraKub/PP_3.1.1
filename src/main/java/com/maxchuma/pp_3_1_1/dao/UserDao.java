package com.maxchuma.pp_3_1_1.dao;


import com.maxchuma.pp_3_1_1.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void saveUser(User user);

    public User getUser(int id);

    void delete(int id);

}
