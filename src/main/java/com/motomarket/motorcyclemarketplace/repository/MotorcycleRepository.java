package com.motomarket.motorcyclemarketplace.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.motomarket.motorcyclemarketplace.model.Motorcycle;

public interface MotorcycleRepository extends JpaRepository<Motorcycle, Long> {

}