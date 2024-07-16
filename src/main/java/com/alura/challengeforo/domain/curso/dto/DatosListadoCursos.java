package com.alura.challengeforo.domain.curso.dto;

import com.alura.challengeforo.domain.curso.Curso;

public record DatosListadoCursos(
        Long id,
        String nombre,
        String categoria
) {
    public DatosListadoCursos(Curso curso) {
        this (curso.getId(), curso.getNombre(), curso.getCategoria());
    }
}
