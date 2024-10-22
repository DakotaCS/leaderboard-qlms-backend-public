package com.quantus.backend.controllers;

import com.quantus.backend.controllers.dto.LeaderboardUserDto;
import com.quantus.backend.services.LeaderboardUserService;
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
@RequestMapping("${api.url.prefix}/user/leaderboards/user")
public class LeaderboardUserController {

    private final LeaderboardUserService leaderboardUserService;

    /**
     * Return all entries for all Leaderboard users
     */
    @GetMapping(value = "/user")
    public ResponseEntity<Object> getAllLeaderboardUsers() {
        return ResponseEntity.ok(DozerEntityMapper.mapObjectList(
                leaderboardUserService.findAllLeaderboardUsers(), LeaderboardUserDto.class));
    }
}
