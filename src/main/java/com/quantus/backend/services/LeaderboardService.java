package com.quantus.backend.services;

import com.quantus.backend.models.Leaderboard;
import com.quantus.backend.repositories.LeaderboardRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author Dakota Soares
 * @version 2024.1
 * @since 2024-05-09
 */

@Service
@Transactional
@RequiredArgsConstructor
public class LeaderboardService {

    private final LeaderboardRepository leaderboardRepository;

    public List<Leaderboard> findAllLeaderboards() {
        return leaderboardRepository.findAll();
    }

    public List<Leaderboard> findTopTenLeaderboardsByCategoryAndSpeed(Integer categoryId) {
        return leaderboardRepository.findTopTenLeaderboardsByCategoryId(categoryId);
    }
}
