package com.motomarket.motorcyclemarketplace.services;

import com.motomarket.motorcyclemarketplace.model.Motorcycle;

import java.util.List;

public interface MotorcycleService {
    List<Motorcycle> getAllMotorcycles();
    Motorcycle getMotorcycleById(Long id);
    Motorcycle addMotorcycle(Motorcycle motorcycle);
    void deleteMotorcycle(Long id);
}
