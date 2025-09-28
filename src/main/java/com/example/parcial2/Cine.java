package com.example.parcial2;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "cines")
@Data
@NoArgsConstructor
public class Cine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String nit;

    @OneToOne(mappedBy = "cine")
    private DetalleCine detalle;

    @OneToMany(mappedBy = "cine")
    private List<Sala> salas;
}
