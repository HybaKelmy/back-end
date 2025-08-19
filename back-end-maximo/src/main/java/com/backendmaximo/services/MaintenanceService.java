package com.backendmaximo.services;

import com.backendmaximo.entities.Maintenance;
import com.backendmaximo.repositories.MaintenanceRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MaintenanceService {

    private final MaintenanceRepository maintenanceRepository;

    public MaintenanceService(MaintenanceRepository maintenanceRepository) {
        this.maintenanceRepository = maintenanceRepository;
    }

    public List<Maintenance> findAll() {
        return maintenanceRepository.findAll();
    }

    public Maintenance findById(Long id) {
        return maintenanceRepository.findById(String.valueOf(id)).orElse(null);
    }

    public Maintenance save(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    public void delete(Long id) {
        maintenanceRepository.deleteById(String.valueOf(id));
    }
}
