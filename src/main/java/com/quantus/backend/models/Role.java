package com.quantus.backend.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Dakota Soares
 * @version 2024.1
 * @since 2024-06-04
 */

@Getter
@Setter
@Entity
@Table(name = "user_role")
public class Role {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    protected Integer id;

    @Column(name = "role_name")
    protected String roleName;

    @Column(name = "user_id")
    protected Integer userId;
}