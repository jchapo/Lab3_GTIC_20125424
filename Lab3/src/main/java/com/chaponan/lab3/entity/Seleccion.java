package com.chaponan.lab3.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "seleccion")
@Getter
@Setter
public class Seleccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSeleccion;
    @Column(name = "nombre",nullable = false)
    private String nombre;
    @Column(name = "tecnico",nullable = false)
    private String tecnico;
    @Column(name = "estadio_idEstadio",nullable = false)
    private String estadio_idEstadio;
}
