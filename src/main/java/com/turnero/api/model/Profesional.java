package com.turnero.api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "profesional")
public class Profesional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String especialidad;

    private String matricula;

    // Getters y Setters
}
