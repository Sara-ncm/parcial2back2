package com.example.parcial2;

import com.example.parcial2.Cine;
import com.example.parcial2.repositorios.CineRepository;
import org.springframework.stereotype.Service;

@Service
public class CineService {

    private final CineRepository cineRepository;

    public CineService(CineRepository cineRepository) {
        this.cineRepository = cineRepository;
    }

    public Cine guardar(Cine cine) {
        return cineRepository.save(cine);
    }
}

