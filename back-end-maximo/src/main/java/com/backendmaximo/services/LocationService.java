package com.backendmaximo.services;

import com.backendmaximo.entities.Location;
import com.backendmaximo.repositories.LocationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {

    private final LocationRepository locationRepository;

    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public List<Location> findAll() {
        return locationRepository.findAll();
    }

    public Location findById(String id) {
        return locationRepository.findById(id).orElse(null);
    }

    public Location save(Location location) {
        return locationRepository.save(location);
    }

    public void delete(String id) {
        locationRepository.deleteById(id);
    }
}
