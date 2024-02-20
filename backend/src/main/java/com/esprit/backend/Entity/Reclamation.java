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

    private Date dateCreation;
    private String description;

    @Enumerated(EnumType.STRING)
    private StatutReclamation statutReclamation;

    @ManyToOne
    @JsonIgnore
    private User user;
    private String userLastname;
    private String userFirstname;
    private String userEmail;
    public String getUserLastname() {
        return this.user.getLastname();
    }
    public void setUserLastname(String userLastname) {
        this.userLastname = userLastname;
    }

    public String getUserFirstname() {
        return this.user.getFirstname();
    }
    public void setUserFirstname(String userFirstname) {
        this.userFirstname = userFirstname;
    }

    public String getUserEmail() {
        return this.user.getEmail();
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
