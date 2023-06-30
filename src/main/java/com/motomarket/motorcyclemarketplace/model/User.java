package com.motomarket.motorcyclemarketplace.model;

import javax.persistence.*;

@Entity
public class User {

    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;
    private String password;

    // getters and setters for all fields...
}
