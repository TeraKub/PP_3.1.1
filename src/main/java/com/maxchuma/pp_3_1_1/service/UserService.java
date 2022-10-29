package com.maxchuma.pp_3_1_1.service;


import com.maxchuma.pp_3_1_1.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void saveUser(User user);

    User getUser(int id);

    void delete(int id);

}
