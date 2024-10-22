package com.quantus.backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name = "leaderboard_category")
public class LeaderboardCategory {

    @Id
    protected Integer id;
    protected String name;
    @Column(name = "created_at")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    protected Date createdAt;
}
