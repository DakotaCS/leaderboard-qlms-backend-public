package com.quantus.backend.repositories;

import com.quantus.backend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminUserRepository extends JpaRepository<User, Integer> {
    User findUserByUserName(String username);
}