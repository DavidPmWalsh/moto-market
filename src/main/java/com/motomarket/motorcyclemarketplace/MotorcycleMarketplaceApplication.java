package com.motomarket.motorcyclemarketplace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.motomarket.motorcyclemarketplace.model"})
@EnableJpaRepositories(basePackages = {"com.motomarket.motorcyclemarketplace.repository"})
public class MotorcycleMarketplaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MotorcycleMarketplaceApplication.class, args);
	}

}
