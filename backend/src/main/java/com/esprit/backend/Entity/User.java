package com.esprit.backend.Entity;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String identifiant;
    private String studentClass;
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;

}
