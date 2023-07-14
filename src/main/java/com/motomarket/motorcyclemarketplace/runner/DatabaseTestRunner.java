package com.motomarket.motorcyclemarketplace.runner;

import com.motomarket.motorcyclemarketplace.model.Motorcycle;
import com.motomarket.motorcyclemarketplace.repository.MotorcycleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseTestRunner implements CommandLineRunner {

    private final MotorcycleRepository repository;

    public DatabaseTestRunner(MotorcycleRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {
        Motorcycle motorcycle = repository.findByModelName("Some Model Name");

        if (motorcycle != null) {
            System.out.println("Found motorcycle with model name: " + motorcycle.getModelName());
        } else {
            System.out.println("No motorcycle found with that model name.");
        }
    }
}
