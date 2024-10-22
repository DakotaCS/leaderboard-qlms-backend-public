package com.quantus.backend.services;

import com.quantus.backend.models.LeaderboardCategory;
import com.quantus.backend.repositories.LeaderboardCategoryRepository;
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
public class LeaderboardCategoryService {

    private final LeaderboardCategoryRepository leaderboardCategoryRepository;

    public List<LeaderboardCategory> findAllLeaderboardCategories() {
        return leaderboardCategoryRepository.findAll();
    }
}