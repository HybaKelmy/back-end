package com.backendmaximo.services;

import com.backendmaximo.entities.Asset;
import com.backendmaximo.repositories.AssetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetService {

    private final AssetRepository assetRepository;

    public AssetService(AssetRepository assetRepository) {
        this.assetRepository = assetRepository;
    }

    public List<Asset> findAll() {
        return assetRepository.findAll();
    }

    public Asset findById(String id) {
        return assetRepository.findById(id).orElse(null);
    }

    public Asset save(Asset asset) {
        return assetRepository.save(asset);
    }

    public void delete(String id) {
        assetRepository.deleteById(id);
    }
}
