package com.example.parcial2;

import com.example.parcial2.DetalleCine;
import com.example.parcial2.repository.DetalleCineRepository;
import org.springframework.stereotype.Service;

@Service
public class DetalleCineService {

    private final DetalleCineRepository detalleCineRepository;

    public DetalleCineService(DetalleCineRepository detalleCineRepository) {
        this.detalleCineRepository = detalleCineRepository;
    }

    public DetalleCine guardar(DetalleCine detalle) {
        return detalleCineRepository.save(detalle);
    }
}
