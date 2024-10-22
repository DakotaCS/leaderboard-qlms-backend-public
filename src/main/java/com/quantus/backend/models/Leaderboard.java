package com.quantus.backend.models;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;

/**
 * @author Dakota Soares
 * @version 2024.1
 * @since 2024-05-09
 */

@Data
@Entity
@Table(name = "leader_board")
public class Leaderboard {

    @Id
    protected Integer id;

    @OneToOne
    @JoinColumn(name = "board_category_id")
    protected LeaderboardCategory leaderboardCategory;

    @OneToOne
    @JoinColumn(name = "user_id")
    protected LeaderboardUser leaderboardUser;

    @Column(name = "max_speed")
    protected Double maxSpeed;

    @Column(name = "car_name")
    protected String carName;

    @Column(name = "created_at")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    protected Date createdAt;
}
