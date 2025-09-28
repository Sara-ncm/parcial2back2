package com.example.parcial2.repository;

import com.example.parcial2.DetalleCine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface DetalleCineRepository extends JpaRepository<DetalleCine, Long> {

    @Query("SELECT d FROM DetalleCine d WHERE d.cine.id = :cineId")
    Optional<DetalleCine> findByCineId(@Param("cineId") Long cineId);
}
