package com.chaponan.lab3.repository;

import com.example.clase1gtics.entity.Shipper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JugadorRepository extends JpaRepository<Shipper, Integer> {
}
