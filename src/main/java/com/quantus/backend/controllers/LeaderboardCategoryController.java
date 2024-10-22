package com.quantus.backend.controllers;

import com.quantus.backend.controllers.dto.LeaderboardCategoryDto;
import com.quantus.backend.services.LeaderboardCategoryService;
import com.quantus.backend.utils.DozerEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dakota Soares
 * @version 2024.1
 * @since 2024-08-02
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("${api.url.prefix}/user/leaderboards/category")
public class LeaderboardCategoryController {

    private final LeaderboardCategoryService leaderboardCategoryService;

    /**
     * Return all entries for all Leaderboard categories
     */
    @GetMapping(value = "/category")
    public ResponseEntity<Object> getAllCategories() {
        return ResponseEntity.ok(DozerEntityMapper.mapObjectList(
                leaderboardCategoryService.findAllLeaderboardCategories(), LeaderboardCategoryDto.class));
    }
}
