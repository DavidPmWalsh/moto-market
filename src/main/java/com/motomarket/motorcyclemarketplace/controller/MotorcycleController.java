package com.motomarket.motorcyclemarketplace.controller;

import com.motomarket.motorcyclemarketplace.model.Motorcycle;
import com.motomarket.motorcyclemarketplace.services.MotorcycleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/motorcycles")
public class MotorcycleController {

    private final MotorcycleService motorcycleService;

    public MotorcycleController(MotorcycleService motorcycleService) {
        this.motorcycleService = motorcycleService;
    }

    @GetMapping
    public List<Motorcycle> getAllMotorcycles() {
        return motorcycleService.getAllMotorcycles();
    }

    @GetMapping("/{id}")
    public Motorcycle getMotorcycle(@PathVariable Long id) {
        return motorcycleService.getMotorcycleById(id);
    }

    @PostMapping
    public Motorcycle addMotorcycle(@RequestBody Motorcycle motorcycle) {
        return motorcycleService.addMotorcycle(motorcycle);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMotorcycle(@PathVariable Long id) {
        motorcycleService.deleteMotorcycle(id);
        return ResponseEntity.noContent().build();
    }
}
