package com.example.parcial2.repositorios;

import com.example.parcial2.Cine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface CineRepository extends JpaRepository<Cine, Long> {

    @Query("SELECT c FROM Cine c WHERE c.nit = :nit")
    Optional<Cine> findByNit(@Param("nit") String nit);

    @Service
    class CineService {

        private final CineRepository cineRepository;

        public CineService(CineRepository cineRepository) {
            this.cineRepository = cineRepository;
        }

        public Cine guardar(Cine cine) {
            return cineRepository.save(cine);
        }
    }
}


