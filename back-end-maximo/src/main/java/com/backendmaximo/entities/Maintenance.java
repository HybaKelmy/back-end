package com.backendmaximo.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "MAINTENANCE")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Maintenance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maint_id")
    private Long maintId;

    @ManyToOne
    @JoinColumn(name = "assetnum", referencedColumnName = "assetnum")
    private Asset asset;

    private String type; // préventive/corrective

    @Column(name = "date_planifiee")
    private LocalDate datePlanifiee;

    @Column(name = "date_realisation")
    private LocalDate dateRealisation;

    private String responsable;
}
