package com.alura.challengeforo.domain.perfil.dto;

import com.alura.challengeforo.domain.perfil.Perfil;

public record DatosResponsePerfil(

        Long id,
        String nombre
) {
    public DatosResponsePerfil(Perfil perfil) {
        this(perfil.getId(), perfil.getNombre());
    }
}
