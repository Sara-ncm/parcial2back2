package com.example.parcial2;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "detalles_cine")
@Data
@NoArgsConstructor
public class DetalleCine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String direccion;
    private String telefono;

    @OneToOne
    @JoinColumn(name = "cine_id")
    private Cine cine;
}

