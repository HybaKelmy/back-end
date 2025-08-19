package com.backendmaximo.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "LOCATIONS")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Location {

    @Id
    @Column(name = "location")
    private String location;

    private String description;

    private String parent;

    private String siteid;

    @OneToMany(mappedBy = "location")
    private List<Asset> assets;
}

