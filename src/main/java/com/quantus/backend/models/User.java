package com.quantus.backend.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Dakota Soares
 * @version 2024.1
 * @since 2024-05-16
 */

@Getter
@Setter
@Entity
@Table(name = "user")
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    protected Integer id;

    @Column(name = "user_name")
    protected String userName;
    @Column(name = "user_password")
    protected String userPassword;
    protected Boolean status;

    @NotFound(action = NotFoundAction.IGNORE)
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_role",
            joinColumns = {
                    @JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "id")})
    private List<Role> roles = new ArrayList<>();
}
