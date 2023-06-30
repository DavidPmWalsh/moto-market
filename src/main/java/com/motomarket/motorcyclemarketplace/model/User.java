package com.motomarket.motorcyclemarketplace.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;
    private String password;
    private String email;

    public String getUsername() {
        return null;
    }

    public String getPassword() {
        return null;
    }

    public String getRoles() {
        return null;
    }

    // constructors, getters, and setters
}