package com.quantus.backend.services;

import com.quantus.backend.models.LeaderboardUser;
import com.quantus.backend.repositories.LeaderboardUserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author Dakota Soares
 * @version 2024.1
 * @since 2024-07-29
 */

@Service
@Transactional
@RequiredArgsConstructor
public class LeaderboardUserService {

    private final LeaderboardUserRepository leaderboardUserRepository;

    public List<LeaderboardUser> findAllLeaderboardUsers() {
        return leaderboardUserRepository.findAll();
    }
}
