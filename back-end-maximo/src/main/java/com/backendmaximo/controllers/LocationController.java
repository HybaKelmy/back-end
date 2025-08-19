package com.backendmaximo.controllers;

import com.backendmaximo.entities.Location;
import com.backendmaximo.services.LocationService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/locations")
public class LocationController {

    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping
    public List<Location> getAll() {
        return locationService.findAll();
    }

    @GetMapping("/{id}")
    public Location getById(@PathVariable String id) {
        return locationService.findById(id);
    }

    @PostMapping
    public Location create(@RequestBody Location location) {
        return locationService.save(location);
    }

    @PutMapping("/{id}")
    public Location update(@PathVariable String id, @RequestBody Location location) {
        location.setLocation(id);
        return locationService.save(location);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        locationService.delete(id);
    }
}
