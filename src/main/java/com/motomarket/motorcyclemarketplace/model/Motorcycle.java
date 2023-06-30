package com.motomarket.motorcyclemarketplace.model;

import javax.persistence.*;

@Entity
public class Motorcycle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String make;
    private String model;
    private int year;
    private double price;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    // getters and setters for all fields...
}
