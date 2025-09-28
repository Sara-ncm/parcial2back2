package com.example.parcial2.repository;

import com.example.parcial2.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SalaRepository extends JpaRepository<Sala, Long> {

    @Query("SELECT s FROM Sala s WHERE s.capacidad >= :minCap")
    List<Sala> findByCapacidadMayorOIgual(@Param("minCap") int minCap);
}
