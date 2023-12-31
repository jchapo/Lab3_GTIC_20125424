package com.chaponan.lab3.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Entity
@Table(name = "estadio")
@Getter
@Setter
public class Estadio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEstadio;

    @Column(name = "nombre",nullable = false)
    private String nombre;
    @Column(name = "provincia",nullable = false)
    private String provincia;
    @Column(name = "club",nullable = false)
    private String club;

}
