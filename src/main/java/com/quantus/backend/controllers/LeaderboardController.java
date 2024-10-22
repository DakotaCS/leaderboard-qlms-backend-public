package com.quantus.backend.controllers;

import com.quantus.backend.controllers.dto.LeaderboardDto;
import com.quantus.backend.services.LeaderboardService;
import com.quantus.backend.utils.DozerEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dakota Soares
 * @version 2024.1
 * @since 2024-05-09
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("${api.url.prefix}/user/leaderboards")
public class LeaderboardController {

    private final LeaderboardService leaderboardService;


    /**
     * Return all entries for all Leaderboard categories
     */
    @GetMapping(value = "")
    public ResponseEntity<Object> getAllLeaderboards() {
        return ResponseEntity.ok(DozerEntityMapper.mapObjectList(
                leaderboardService.findAllLeaderboards(), LeaderboardDto.class));
    }

    /**
     * Return the top 10 leaderboard entries based on category and top speed.
     */
    @GetMapping(value = "/category/{id}")
    public ResponseEntity<Object> getTop10LeaderboardsByCategoryId(@PathVariable(name = "id") Integer categoryId) {
        return ResponseEntity.ok(DozerEntityMapper.mapObjectList(
                leaderboardService.findTopTenLeaderboardsByCategoryAndSpeed(
                        categoryId), LeaderboardDto.class));
    }
}
