package com.motomarket.motorcyclemarketplace.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.motomarket.motorcyclemarketplace.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}