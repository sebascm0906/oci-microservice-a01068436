package com.example.oci_microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.oci_microservice.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
