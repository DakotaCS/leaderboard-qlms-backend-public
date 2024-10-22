package com.quantus.backend.services;

import com.quantus.backend.models.User;
import com.quantus.backend.repositories.AdminUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminUserService {
    private final AdminUserRepository adminUserRepository;
    private final PasswordEncoder passwordEncoder;

    public void saveUser(User user) {
        user.setUserPassword(passwordEncoder.encode(user.getUserPassword()));
        adminUserRepository.save(user);
    }
}
