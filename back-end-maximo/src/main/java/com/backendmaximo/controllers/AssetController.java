package com.backendmaximo.controllers;

import com.backendmaximo.entities.Asset;
import com.backendmaximo.services.AssetService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/assets")
public class AssetController {

    private final AssetService assetService;

    public AssetController(AssetService assetService) {
        this.assetService = assetService;
    }

    @GetMapping
    public List<Asset> getAll() {
        return assetService.findAll();
    }

    @GetMapping("/{id}")
    public Asset getById(@PathVariable String id) {
        return assetService.findById(id);
    }

    @PostMapping
    public Asset create(@RequestBody Asset asset) {
        return assetService.save(asset);
    }

    @PutMapping("/{id}")
    public Asset update(@PathVariable String id, @RequestBody Asset asset) {
        asset.setAssetnum(id);
        return assetService.save(asset);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        assetService.delete(id);
    }
}
