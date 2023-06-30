package com.motomarket.motorcyclemarketplace.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Motorcycle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String make;
    private String model;
    private String description;
    private double price;
    private String imageUrl;

    // constructors, getters, and setters
}
