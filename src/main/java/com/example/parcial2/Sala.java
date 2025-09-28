package com.example.parcial2;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "salas")
@Data
@NoArgsConstructor
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private int capacidad;

    @ManyToOne
    @JoinColumn(name = "cine_id")
    private Cine cine;
}
