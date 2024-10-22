package com.quantus.backend.controllers.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;

/**
 * @author Dakota Soares
 * @version 2024.1
 * @since 2024-05-15
 */

@Data
public class LeaderboardDto {
    protected LeaderboardCategoryDto leaderboardCategory;
    protected LeaderboardUserDto leaderboardUser;
    protected Double maxSpeed;
    protected String carName;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    protected Date createdAt;
}
