package com.quantus.backend.repositories;

import com.quantus.backend.models.Leaderboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

/**
 * @author Dakota Soares
 * @version 2024.1
 * @since 2024-05-09
 */

public interface LeaderboardRepository extends JpaRepository<Leaderboard, Integer> {

    @Query("select l1 from Leaderboard l1 where l1.leaderboardCategory.id = ?1 order by l1.maxSpeed desc limit 10")
    List<Leaderboard> findTopTenLeaderboardsByCategoryId(Integer categoryId);
}
