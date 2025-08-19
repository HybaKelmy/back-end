package com.backendmaximo.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "WORKORDERS")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WorkOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wo_id")
    private Long woId;

    @ManyToOne
    @JoinColumn(name = "assetnum", referencedColumnName = "assetnum")
    private Asset asset;

    private String description;

    private String status;

    @Column(name = "reported_date")
    private LocalDate reportedDate;

    @Column(name = "target_date")
    private LocalDate targetDate;

    @Column(name = "completed_date")
    private LocalDate completedDate;
}
