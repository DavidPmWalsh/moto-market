package com.motomarket.motorcyclemarketplace.services.impl;

import com.motomarket.motorcyclemarketplace.model.Motorcycle;
import com.motomarket.motorcyclemarketplace.repository.MotorcycleRepository;
import com.motomarket.motorcyclemarketplace.services.MotorcycleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotorcycleServiceImpl implements MotorcycleService {

    private final MotorcycleRepository motorcycleRepository;

    public MotorcycleServiceImpl(MotorcycleRepository motorcycleRepository) {
        this.motorcycleRepository = motorcycleRepository;
    }

    @Override
    public List<Motorcycle> getAllMotorcycles() {
        return motorcycleRepository.findAll();
    }

    @Override
    public Motorcycle getMotorcycleById(Long id) {
        return motorcycleRepository.findById(id).orElse(null);
    }

    @Override
    public Motorcycle addMotorcycle(Motorcycle motorcycle) {
        return motorcycleRepository.save(motorcycle);
    }

    @Override
    public void deleteMotorcycle(Long id) {
        motorcycleRepository.deleteById(id);
    }
}
