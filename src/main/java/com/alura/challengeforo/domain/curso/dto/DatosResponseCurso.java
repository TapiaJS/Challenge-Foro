package com.alura.challengeforo.domain.curso.dto;

import com.alura.challengeforo.domain.curso.Curso;

public record DatosResponseCurso(
        Long id,
        String nombre,
        String categoria
) {

    public DatosResponseCurso(Curso curso) {
        this(curso.getId(), curso.getNombre(), curso.getCategoria());
    }
}
