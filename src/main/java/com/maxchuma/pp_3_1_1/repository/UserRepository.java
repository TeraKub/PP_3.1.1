package com.maxchuma.pp_3_1_1.repository;

import com.maxchuma.pp_3_1_1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
