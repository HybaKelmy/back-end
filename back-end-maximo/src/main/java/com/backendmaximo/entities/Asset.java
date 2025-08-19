package com.backendmaximo.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "ASSETS")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Asset {

    @Id
    @Column(name = "assetnum")
    private String assetnum;

    private String description;

    private String status;

    private String siteid;

    @ManyToOne
    @JoinColumn(name = "location", referencedColumnName = "location")
    private Location location;

    @OneToMany(mappedBy = "asset")
    private List<WorkOrder> workOrders;

    @OneToMany(mappedBy = "asset")
    private List<Maintenance> maintenances;
}

