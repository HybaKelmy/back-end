package com.esprit.backend.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Reclamation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idReclamation;
    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    private String description;
    @Enumerated(EnumType.STRING)
    private StatutReclamation statutReclamation;

    @ManyToOne
    @JsonIgnore
    private User user;
}
