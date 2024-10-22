package com.quantus.backend.repositories;

import com.quantus.backend.models.LeaderboardUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Dakota Soares
 * @version 2024.1
 * @since 2024-07-29
 */
public interface LeaderboardUserRepository extends JpaRepository<LeaderboardUser, Integer> {}
