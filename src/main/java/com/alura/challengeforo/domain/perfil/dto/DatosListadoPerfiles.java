package com.alura.challengeforo.domain.perfil.dto;

import com.alura.challengeforo.domain.perfil.Perfil;

public record DatosListadoPerfiles(
    Long id,
    String nombre
){
    public DatosListadoPerfiles(Perfil perfil) {
            this(perfil.getId(), perfil.getNombre());
        }
    }