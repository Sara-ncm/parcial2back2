package com.example.parcial2;

public class CineMapper {

    // De entidad a DTO
    public static CineDTO toDTO(Cine cine) {
        CineDTO dto = new CineDTO();
        dto.setId(cine.getId());
        dto.setNombre(cine.getNombre());
        dto.setNit(cine.getNit());
        return dto;
    }

    // De DTO a entidad
    public static Cine toEntity(CineDTO dto) {
        Cine cine = new Cine();
        cine.setId(dto.getId());
        cine.setNombre(dto.getNombre());
        cine.setNit(dto.getNit());
        return cine;
    }
}

