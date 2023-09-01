package com.chaponan.lab3.repository;

import com.chaponan.lab3.entity.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadioRepository extends JpaRepository<Jugador, Integer> {
}
