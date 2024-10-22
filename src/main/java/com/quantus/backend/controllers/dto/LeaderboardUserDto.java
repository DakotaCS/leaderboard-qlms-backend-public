package com.quantus.backend.controllers.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.util.Date;

/**
 * @author Dakota Soares
 * @version 2024.1
 * @since 2024-07-29
 */

@Data
public class LeaderboardUserDto {
    protected String name;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyy-MM-dd")
    protected Date createdAt;
}
